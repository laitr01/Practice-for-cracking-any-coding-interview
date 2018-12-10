package string

import extensions.string.isPalindrome
import java.util.*

class SaveIronman {
    /**
     *   Jarvis is weak in computing palindromes for Alphanumeric characters.
     *   While Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis is stuck in computing palindromes.
     *   You are given a string S containing alphanumeric characters. Find out whether the string is a palindrome or not.
     *   If you are unable to solve it then it may result in the death of Iron Man.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val text = readLine()!!
                val strBuilder = StringBuilder()

                for (i in 0 until text.length) {
                    if (text[i].isLowerCase()) {
                        strBuilder.append(text[i])
                    }
                    if (text[i].isUpperCase()) {
                        strBuilder.append(text[i].toLowerCase())
                    }
                }
                println(strBuilder.toString().isPalindrome(strBuilder.length))
                testCaseNumber--
            }
        }
    }
}