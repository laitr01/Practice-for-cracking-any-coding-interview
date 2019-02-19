package string

import extensions.string.including
import java.util.*

class ImplementStrstr {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = readLine()!!
                val textTwo = readLine()!!

                if (textOne.including(textTwo)) {
                    println("Yes")
                } else {
                    println("No")
                }
                testCaseNumber--
            }
        }

    }
}