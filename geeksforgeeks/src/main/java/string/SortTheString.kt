package string

import java.util.*
import sun.nio.cs.Surrogate.high



class SortTheString {

    //Given a string S containing only lower case alphabets, the task is to sort it in lexigraphically-descending order.
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var testCaseNumber = scanner.nextInt()

            while (testCaseNumber > 0){
                val text = readLine()!!
                val start = 0;
                val end = text.length

                println(quickSort(text.toCharArray(), start, end-1))
                testCaseNumber--
            }
        }

        private fun quickSort(text: CharArray, start: Int, end: Int): String {
            if(start < end){
                val  pivot = partition(text, start, end)
                quickSort(text, pivot + 1, end)
                quickSort(text, start, pivot - 1)
            }
            return String(text)
        }

        private fun partition(text: CharArray, start: Int, end: Int): Int {
            val pivot = text[end]
            var i = start - 1

            for(j in start until end){
                if( text[j] <= pivot){
                    i++

                    val temp = text[i]
                    text[i] = text[j]
                    text[j] = temp
                }
            }

            // swap arr[i+1] and arr[high] (or pivot)
            val temp = text[i + 1]
            text[i + 1] = text[end]
            text[end] = temp

            return i + 1

        }
    }
}