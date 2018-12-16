package string

import extensions.string.isNotSpace
import java.util.*

class URLifyString {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0) {
                println(urlifyString(readLine()!!))
                testCaseNumber--
            }
        }

        private fun urlifyString(text: String): String {

            val stringBuilder = StringBuilder()

            for (i in 0 until text.length) {
                val rs = if (text[i].isNotSpace()) {
                    "${text[i]}"
                } else {
                    "%20"
                }
                stringBuilder.append(rs)
            }

            return stringBuilder.toString()
        }
    }

}