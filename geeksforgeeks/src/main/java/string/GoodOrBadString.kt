package string

import extensions.string.isGood
import java.util.*

class GoodOrBadString {
    /**
     * In this problem, a String S is composed of lowercase alphabets and wildcard characters i.e. '?'. Here, '?' can be replaced by any of the lowercase alphabets.
     * Now you have to classify the given String on the basis of following rules:
     * If there are more than 3 consonants together or more than 5 vowels together, the String is considered to be "BAD". A String is considered "GOOD" only if it is not “BAD”.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0){
                val text = scanner.next()
                val isGood = text.isGood()

                if (isGood) {
                    println("Yes")
                } else {
                    println("No")
                }
                testCaseNumber--
            }
        }
    }
}