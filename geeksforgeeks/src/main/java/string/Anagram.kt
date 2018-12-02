package string

import extensions.string.isAnagram
import java.util.*

class Anagram {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0){
                val textOne = scanner.next()
                val textTwo = scanner.next()

                val isAnagram = textOne.toLowerCase()
                        .isAnagram(textTwo.toLowerCase())
                if(isAnagram) {
                    println("Yes")
                }else{
                    println("No")
                }
            }
        }
    }
}