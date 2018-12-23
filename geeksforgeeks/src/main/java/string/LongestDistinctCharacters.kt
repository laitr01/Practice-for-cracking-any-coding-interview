package string

import extensions.string.longestDistinctCharacters
import java.util.*

/**
 * Given a string S, find length of the longest substring with all distinct characters.
 * For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.
    Input:
    The first line of input contains an integer T denoting the number of test cases.
    The first line of each test case is String str.
    Output:
    Print length of smallest substring with maximum number of distinct characters.
    Note: The output substring should have all distinct characters.
    Constraints:
    1 ≤ T ≤ 100
    1 ≤ size of str ≤ 10000
    Example:
    Input:
    2
    abababcdefababcdab
    geeksforgeeks
    Output:
    6
    7
 */
class LongestDistinctCharacters {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = scanner.next()

                val longestDistinctCharacters = textOne.toLowerCase()
                        .longestDistinctCharacters()
                println(longestDistinctCharacters)
                testCaseNumber--
            }
        }
    }
}