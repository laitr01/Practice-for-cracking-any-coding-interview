package string

import extensions.string.findUncommonCharactersWith
import extensions.string.isKAnagram
import java.util.*

/**
 * Find and print the uncommon characters of the two given strings S1 and S2.
 * Here uncommon character means that either the character is present in one string or it is present in other string but not in both.
 * The strings contains only lowercase characters and can contain duplicates.
 *   Input:
 *   The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two strings in two subsequent lines.
 *   Output:
 *   For each testcase, in a new line, print the uncommon characters of the two given strings in sorted order.
    Constraints:
    1 <= T <= 100
    1 <= |S1|, |S2| <= 105

    Example:
    Input:
    1
    characters
    alphabets
    Output:
    bclpr
 */
class UncommonCharacters {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = readLine()!!
                val textTwo = readLine()!!
                println(textOne.findUncommonCharactersWith(textTwo))
                testCaseNumber--
            }
        }
    }
}