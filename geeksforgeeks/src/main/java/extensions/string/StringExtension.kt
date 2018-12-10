package extensions.string

fun String.isPalindrome(length: Int): Boolean {
    val halfOfTextLen = if (length % 2 == 0) length / 2 else (length - 1) / 2
    for (i in 0 until halfOfTextLen) {
        if (this[i] != this[length - 1 - i]) {
            return false
        }
    }
    return true
}

fun String.isAnagram(other: String): Boolean {

    val NO_OF_CHARS = 256

    val arrayOne = Array(NO_OF_CHARS) { 0 }
    val arrayTwo = Array(NO_OF_CHARS) { 0 }

    if (length != other.length) return false

    for (i in 0 until length) {
        arrayOne[this[i].toInt()]++
        arrayTwo[other[i].toInt()]++
    }

    for (i in 0 until NO_OF_CHARS) {
        if (arrayOne[i] != arrayTwo[i]) {
            return false
        }
    }
    return true
}

fun String.isAnagramPalindrome(): Boolean {

    val NO_OF_CHARS = 256
    val isEven = length % 2 == 0
    var count = 0
    val array = Array(NO_OF_CHARS) { 0 }

    if (length <= 1) return false

    for (i in 0 until length) {
        array[this[i].toInt()]++
    }

    for (i in 0 until NO_OF_CHARS) {
        if (array[i] % 2 != 0) {
            count++
            if (isEven) {
                return false
            } else {
                if (count > 1) {
                    return false
                }
            }
        }
    }
    return true
}

fun String.upperFirstLetterOfWord(): String {
    val array = this.toCharArray()
    if (array[0].isLowerLetter()) {
        array[0] = (array[0].toInt() - 32).toChar()
    }

    for (i in 1 until length) {
        if (array[i].toInt() == 32) {
            if (array[i + 1].isLowerLetter()) {
                array[i + 1] = (array[i + 1].toInt() - 32).toChar()
            }
        }
    }
    return String(array)
}

fun Char.isLowerLetter(): Boolean = toInt() in 97..122

fun Char.isUpperLetter(): Boolean = toInt() in 65..90

fun Char.isLetter(): Boolean = isLowerLetter() || isUpperLetter()

fun Char.isNotSpace(): Boolean {
    return toInt() != 32
}

fun String.merge(other: String): String {
    val isLarge = other.length <= length
    val indexTravelTo = if (!isLarge) length else other.length
    val resultBuilder = StringBuilder()

    for (i in 0 until indexTravelTo) {
        if (this[i].isNotSpace()) {
            resultBuilder.append(this[i])
        }
        if (other[i].isNotSpace()) {
            resultBuilder.append(other[i])
        }
    }

    resultBuilder.append(if (isLarge) {
        substring(indexTravelTo, length).replace(" ", "")
    } else {
        other.substring(indexTravelTo, other.length).replace(" ", "")
    })

    return resultBuilder.toString()
}


fun String.isGood(): Boolean {
    var vowelCount = 0
    var constantCount = 0
    for(i in 0 until length){
        if(vowelCount >= 5 || constantCount >= 3){
            return false
        }

        if(this[i].isVowel()){
            vowelCount++
            constantCount = 0
        }

        if(this[i].isConstant()){
            constantCount++
            vowelCount = 0
        }

        if(!this[i].isVowel() && !this[i].isConstant()){
            constantCount = 0
            vowelCount = 0
        }
    }
    return true
}

val vowelArray = arrayOf( 'a', 'e', 'i', 'o', 'u' )

fun Char.isVowel(): Boolean {
    vowelArray.forEach {
        if(this == it){
            return true
        }
    }
    return false
}

fun Char.isConstant(): Boolean {
    if (!this.isLetter()) {
        return false
    }
    vowelArray.forEach {
        if(this == it){
            return false
        }
    }
    return true
}
