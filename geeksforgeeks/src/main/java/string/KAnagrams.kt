package string

import extensions.string.isKAnagram
import java.util.*

/**
 * Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.
 *   Two strings are called K-anagrams if both of the below conditions are true.
 *   1. Both have same number of characters.
 *   2. Two strings can become anagram by changing at most K characters in a string
 *  Input Format:
 */
class KAnagrams {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = readLine()!!
                val textTwo = readLine()!!
                val k = scanner.nextInt()
                println(textOne.isKAnagram(textTwo, k))
                testCaseNumber--
            }
        }
    }
}