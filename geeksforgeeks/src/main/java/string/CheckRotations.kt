package string

import extensions.string.isRotateBy
import java.util.*

class CheckRotations {
    /**
     * Given strings s1 and s2, you need to find if s2 is a rotated version of the string s1. The strings are lowercase.
     *   Input:
     *   The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows. Each testcase contains two lines for s1 and s2.
     *   Output:
     *   For each testcase, in a new line, you need to print 1 if s2 is a rotated version of s1; else print 0.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = readLine()!!
                val textTwo = readLine()!!
                println(textOne.isRotateBy(textTwo))
                testCaseNumber--
            }
        }
    }
}