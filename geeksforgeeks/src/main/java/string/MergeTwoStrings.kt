package string

import extensions.string.merge
import java.util.*

class MergeTwoStrings {
    //Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
    //NOTE: Add the whole string if other string is empty.
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val text1 = readLine()!!
                val text2 = readLine()!!

                println(text1.merge(text2))
                testCaseNumber--
            }
        }
    }
}