class Counting {
    companion object {
        @Throws(InterruptedException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            class Counter {
                var counter = 0
                fun increment() {
                    counter++
                }

                fun get(): Int {
                    return counter
                }
            }

            val counter = Counter()

            class CountingThread : Thread() {
                override fun run() {
                    for (x in 0..499999) {
                        counter.increment()
                    }
                }
            }

            val t1 = CountingThread()
            val t2 = CountingThread()
            t1.start()
            t2.start()
            t1.join()
            t2.join()
            println(counter.get())
        }
    }
}