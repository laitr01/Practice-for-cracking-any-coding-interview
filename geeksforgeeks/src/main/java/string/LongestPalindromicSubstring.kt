package string

import extensions.string.longestPalindromicSubstring
import java.util.*

/**
 *
 *   Given a string, find the longest substring which is palindrome in Linear time O(N).
 *   Input:
 *   The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The only line of each test case contains a string.
 *   Output:
 *   For each test case print the Longest Palindromic Substring.
 *   Constraints:
 *   1 <= T <= 100
 *   1 <= N <= 50
 *   Example:
 *   Input:
 *   2
 *   babcbabcbaccba
 *   forgeeksskeegfor
 *   Output:
 *   abcbabcba
 *   geeksskeeg
 */
class LongestPalindromicSubstring {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = scanner.next()

                val longestPalindromicSubstring = textOne.toLowerCase()
                        .longestPalindromicSubstring()
                println(longestPalindromicSubstring)
                testCaseNumber--
            }
        }
    }
}