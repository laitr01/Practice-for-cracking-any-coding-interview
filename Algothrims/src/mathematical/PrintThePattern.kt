package mathematical

class PrintThePattern {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            print(printPattern(2))
        }

        fun printPattern(number: Int): String{
            if(number < 1) return "$number is negative number"
            var countLoop1 = number

            val result = StringBuilder()
            while (countLoop1 > 0){
                var countLoop2 = number
                while (countLoop2 > 0){
                    for (i in 0 until countLoop1){
                        result.append("$countLoop2 ")
                    }
                    countLoop2--
                }
                result.append("$")
                countLoop1--
            }
            return result.toString()
        }

        /*void printPat(int number)
        {
            StringBuilder result = new StringBuilder();
            int countLoop1 = number;
            while (countLoop1 > 0){
                int countLoop2 = number;
                while (countLoop2 > 0){
                    for (int i = 0; i <  countLoop1; i++){
                        result.append(countLoop2+" ");
                    }
                    countLoop2--;
                }
                result.append("$");
                countLoop1--;
            }
            System.out.printf(result.toString());
        }*/
    }
}