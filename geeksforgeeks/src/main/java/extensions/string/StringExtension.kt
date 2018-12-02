package extensions.string

import java.util.*

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

fun Char.isLowerLetter(): Boolean {
    return toInt() in 97..122
}

