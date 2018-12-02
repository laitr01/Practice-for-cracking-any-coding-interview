package string

import extensions.string.isPalindrome
import java.util.*

class CheckForPalindrome {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textLen = scanner.nextInt()
                val text = scanner.next()

                val isPalindrome = text.toLowerCase().isPalindrome(textLen)
                if (isPalindrome) {
                    println("Yes")
                } else {
                    println("No")
                }
                testCaseNumber--
            }
        }
    }

}


