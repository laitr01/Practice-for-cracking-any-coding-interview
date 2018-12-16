package string

import extensions.string.needRemoveToAnagram
import java.util.*

/**
 * Given two strings S1 and S2 in lowercase, the task is to make them anagram.
 * The only allowed operation is to remove a character from any string.
 * Find minimum number of characters to be deleted to make both the strings anagram.
 * If two strings contains same data set in any order then strings are called Anagrams.
 *   Input Format:
 *   The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of 2 strings to make the anagrams.
 *   Output Format:
 *   For each testcase, in a new line, output the minimum number of characters to be deleted to make both the strings anagram.
 *   Your Task:
 *   Since this is a function problem, you don't need to take any input. Just complete the provided function.
 *   Constraints:
 *   1 <= T <= 100
 *   1 <= |S1|, |S2| <= 105
 *   Example:
 *   Input:
 *   2
 *   bcadeh
 *   hea
 *   cddgk
 *   gcd
 *   Output:
 *   3
 *   2
 */
class AnagramOfString {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = scanner.next()
                val textTwo = scanner.next()

                val needRemoveToAnagram = textOne.toLowerCase()
                        .needRemoveToAnagram(textTwo.toLowerCase())
                println(needRemoveToAnagram)
                testCaseNumber--
            }
        }
    }
}
