package string

import extensions.string.includes
import extensions.string.isSubsequence
import java.util.*

class CheckForSubsequence {
    /**
        Given two strings A and B, find if A is a subsequence of B.
        Input:
        The first line of input contains an integer T denoting the no of test cases.
        Then T test cases follow. Each test case contains two space separated strings A and B.
        Output:
        For each test case, in a new line, print 1 if a is sub-sequences of b else print 0.
    */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = readLine()!!
                val textTwo = readLine()!!
                println(textOne.isSubsequence(textTwo))
                testCaseNumber--
            }
        }
    }
}