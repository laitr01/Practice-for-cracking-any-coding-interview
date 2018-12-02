package string

import extensions.string.upperFirstLetterOfWord
import java.util.*

class UpperCaseConversion {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0){
                val text = readLine()!!
                println(text.upperFirstLetterOfWord())
                testCaseNumber--
            }
        }
    }

}