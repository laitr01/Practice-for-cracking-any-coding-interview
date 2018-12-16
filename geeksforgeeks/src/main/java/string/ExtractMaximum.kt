package string

import extensions.string.extractMaximum
import java.util.*

class ExtractMaximum {
    /**
     * https://practice.geeksforgeeks.org/problems/extract-maximum/0
     * You have been given an alphanumeric string S, extract maximum numeric value from that string. Alphabets will only be in lower case.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0){
                val text = readLine()!!
                println(text.extractMaximum())
                testCaseNumber--
            }
        }
    }
}