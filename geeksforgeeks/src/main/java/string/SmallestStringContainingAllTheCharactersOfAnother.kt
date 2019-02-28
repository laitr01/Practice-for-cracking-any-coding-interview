package string

import extensions.string.longestDistinctCharacters
import extensions.string.smallestStringContainingAllTheCharactersOf
import java.util.*

/**
 * Given a string S and text t. Output the smallest window in the string having all characters of the text. Both the string and text contains small case letters.
    Input:
    First line contains T , the number of test cases and each test contains 2 lines having a string S and t.
    Output:
    Output the smallest window of the string containing all the characters of the text. If such window doesn`t exist or this task can not be done then print -1.
    Constraints:
    1 <= T <= 100
    1 <= N, X <= 1000
    Example:
    Input:
    2
    timetopractice
    toc
    zoomlazapzo
    oza
    Output:
    toprac
    apzo
 */
class SmallestStringContainingAllTheCharactersOfAnother {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = readLine()!!
                val textTwo = readLine()!!

                val smallestWindow = textOne.smallestStringContainingAllTheCharactersOf(textTwo)
                println(smallestWindow)
                testCaseNumber--
            }
        }
    }
}