package string

import extensions.string.reverse
import java.util.*

class ReverseWords {
    /**
     * https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
     * Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0){
                val text = readLine()!!
                println(text.reverse())
                testCaseNumber--
            }
        }
    }

}