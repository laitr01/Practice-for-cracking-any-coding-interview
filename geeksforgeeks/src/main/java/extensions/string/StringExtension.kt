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
    var count = 0
    for (i in 0 until length) {
        if (vowelCount > 5 || constantCount > 3) {
            return false
        }

        when {
            this[i].isVowel() -> {
                vowelCount++
                constantCount = 0
                count = 0
            }
            this[i].isConstant() -> {
                constantCount++
                vowelCount = 0
                count = 0
            }
            else -> {
                count++
                constantCount = if (constantCount != 0) ++constantCount else count
                vowelCount = if (vowelCount != 0) ++vowelCount else count
            }
        }
    }
    return true
}

val vowelArray = arrayOf('a', 'e', 'i', 'o', 'u')

fun Char.isVowel(): Boolean {
    vowelArray.forEach {
        if (this == it) {
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
        if (this == it) {
            return false
        }
    }
    return true
}

val digits = arrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

fun String.extractMaximum(): Int {
    var max = -1
    var number = -1
    val strTemp = StringBuilder()

    for (i in 0 until length) {
        if (digits.contains(this[i])) {
            strTemp.append(this[i])
            number = strTemp.toString().toInt()
            if (number > max) {
                max = number
            }
        } else {
            strTemp.setLength(0)
        }
    }
    return max
}

fun String.reverse(): String {

    var strResult = ""
    var strTemp = ""

    for (i in 0 until length) {
        if (this[i] != '.') {
            strTemp += this[i]
        } else if (this[i] == '.') {
            strResult = ".$strTemp$strResult"
            strTemp = ""
        }

        if (i == length - 1) {
            strResult = "$strTemp$strResult"
            strTemp = ""
        }
    }
    return strResult
}

fun String.includes(text: String): Int {

    val textLen = text.length
    if (textLen > length) return -1
    var markIndex = 0

    for (i in 0 until length) {
        markIndex = i
        if (length - markIndex < textLen) {
            return -1
        } else {
            if (text == substring(i, i + textLen)) {
                return markIndex
            }
        }
    }
    return markIndex
}

fun String.isSubsequence(text: String): Int {
    var index1 = length - 1
    var index2 = text.length - 1


    while (index1 > index2) {
        if (index2 == 0) return 1
        if (index1 == 0) return 0
        if (this[index1] == text[index2]) {
            index2--
        }
        index1--
    }

    return 0
}

fun String.isRotateBy(text: String): Boolean {
    val doubleString = "$this$this"
    return doubleString.contains(text)
}

// Function to check that string is k-anagram or not
fun String.isKAnagram(text: String, k: Int): Boolean {

    if (length != text.length) {
        return false
    }

    val charArray1 = Array(256) { 0 }
    val charArray2 = Array(256) { 0 }
    var count = 0

    for (i in 0 until length) {
        charArray1[this[i] - 'a']++
    }

    for (i in 0 until length) {
        charArray2[text[i] - 'a']++
    }

    for (i in 0 until 256) {
        if (charArray1[i] > charArray2[i]) {
            count += Math.abs(charArray1[i] - charArray2[i])
        }
    }

    return count <= k
}

//const int MAX_CHAR = 26;
fun String.findUncommonCharactersWith(textTwo: String): String {
    val charStored1 = Array(256) { 0 }
    for (i in 0 until length) {
        charStored1[this[i].toInt()]++
    }

    val charStored2 = Array(256) { 0 }
    for (i in 0 until textTwo.length) {
        charStored2[textTwo[i].toInt()]++
    }
    val resultBuilder = StringBuilder()

    for (i in 0 until 256) {
        if (charStored1[i] > 0 && charStored2[i] == 0) {
            resultBuilder.append(i.toChar())
        }
        if (charStored2[i] > 0 && charStored1[i] == 0) {
            resultBuilder.append(i.toChar())
        }
    }
    return resultBuilder.toString()
}

fun String.needRemoveToAnagram(text: String): Int {
    val charCount1 = Array(26) { 0 }
    val charCount2 = Array(26) { 0 }

    for (i in 0 until length) {
        charCount1[this[i] - 'a']++
    }

    for (i in 0 until text.length) {
        charCount2[text[i] - 'a']++
    }

    var result = 0
    for (i in 0 until 26) {
        result += Math.abs(charCount1[i] - charCount2[i])
    }

    return result
}

fun String.findFirstRepeatedCharacter(): String {

    val charSet = HashSet<Char>()
    for (i in 0 until length) {
        if (charSet.contains(this[i])) {
            return this[i].toString()
        } else {
            charSet.add(this[i])
        }
    }
    return ""
}

fun String.nonRepeatingCharacter(): String {
    val charCount = Array(26) { 0 }
    for (i in 0 until length) {
        charCount[this[i] - 'a']++
    }

    for (i in 0 until length) {
        if (charCount[this[i] - 'a'] == 1) {
            return this[i].toString()
        }
    }
    return ""
}

fun String.longestDistinctCharacters(): Int {
    var currentLength = 1
    var maxLength = 1
    var prevIndex: Int
    val visited = Array(256) { -1 }

    visited[this[0].toInt()] = 0

    for (i in 1 until length) {
        prevIndex = visited[this[i].toInt()]

        if (prevIndex == -1 || i - currentLength > prevIndex) {
            currentLength++
        } else {
            if (currentLength > maxLength) {
                maxLength = currentLength
            }
            currentLength = i - prevIndex
        }
        visited[this[i].toInt()] = i
    }

    // Compare the length of last NRCS with max_len and
    // update max_len if needed
    if (currentLength > maxLength)
        maxLength = currentLength;

    return maxLength;
}


fun String.longestPalindromicSubstring(): String {
    val table = Array(length) {Array(length) {false} }
    var maxLength = 1
    for(i in 0 until length){
        table[i][i] = true
    }
    var start = 0
    for(i in 0 until length - 1){
         if(this[i] == this[i+1]){
             table[i][i+1] = true
             start = i
             maxLength = 2
         }
    }

    for (k in 3 .. length){

    }
}