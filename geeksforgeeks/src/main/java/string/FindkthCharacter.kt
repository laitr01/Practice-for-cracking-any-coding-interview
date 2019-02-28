package string

import extensions.string.binaryConversion
import java.util.*

class FindkthCharacter {
    /**
     *   Given a decimal number m.
     *   Convert it in binary string and apply n iterations, in each iteration 0 becomes 01 and 1 becomes 10.
     *   Find kth character in the string after nth iteration.
     *   Input:
     *   The first line consists of an integer T i.e number of test cases. The first and only line of each test case consists of three integers m,k,n.
     *   Output:
     *   Print the required output.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                val number = scanner.nextInt()
                val iterations = scanner.nextInt()
                val i = scanner.nextInt()

                val kthCharacter = findKthCharacter(number, iterations, i)
                println(kthCharacter)
                testCaseNumber--
            }
        }

        private fun findKthCharacter(number: Int, iterator: Int, i: Int): Char {
            var binaryString = number.binaryConversion()

            for (i in 0 until iterator){
                val builder = StringBuilder()
                for (j in 0 until binaryString.length){
                    if(binaryString[j] == '1'){
                        builder.append("10")
                    }else{
                        builder.append("01")
                    }
                }
                binaryString = builder.toString()
            }
            return binaryString[i-1]
        }
    }
}