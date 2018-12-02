package string

import extensions.string.isAnagramPalindrome
import extensions.string.upperFirstLetterOfWord
import java.util.*

class AnagramPalindrome {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0){
                val text = scanner.next()
                val isAnagramPalindrome = text.isAnagramPalindrome()

                if (isAnagramPalindrome) {
                    println("Yes")
                } else {
                    println("No")
                }
                testCaseNumber--
            }
        }
    }

}