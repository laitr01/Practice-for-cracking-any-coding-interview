package string

import extensions.string.findFirstRepeatedCharacter
import java.util.*

/**
 * Given a string S. The task is to find the first repeated character in it.
 * We need to find the character that occurs more than once and whose index of first occurrence is smallest.
 * S contains only lowercase letters.
    Input:
    The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains a string S.
    Output:
    For each test case in a new line print the first repeating character in the string. If no such character exist print -1.
    Constraints:
    1 <= T <= 100
    1 <= |S| <=104
    Example:
    Input:
    2
    geeksforgeeks
    hellogeeks
    Output:
    e
    l
 */
class FindFirstRepeatedCharacter {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val text = scanner.next()
                println(text.findFirstRepeatedCharacter())
                testCaseNumber--
            }
        }
    }
}