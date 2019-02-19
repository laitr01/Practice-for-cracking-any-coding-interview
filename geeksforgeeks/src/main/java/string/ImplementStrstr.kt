package string
import extensions.string.includes
import java.util.*

class ImplementStrstr {
    /**
     * https://practice.geeksforgeeks.org/problems/implement-strstr/1
     * Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s.
     * The function returns and integer denoting the first occurrence of the string x in s.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val textOne = readLine()!!
                val textTwo = readLine()!!
                println(textOne.includes(textTwo))
                testCaseNumber--
            }
        }

    }
}