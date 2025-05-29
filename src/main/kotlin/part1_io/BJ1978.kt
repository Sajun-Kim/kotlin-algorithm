package part1_io

import java.util.StringTokenizer

class BJ1978 {
    fun main() = with(System.`in`.bufferedReader()) {
        val n = readLine().toInt()
        val nums = StringTokenizer(readLine())

        var primeCnt = 0
        for (i in 0 until n) {
            val num = nums.nextToken().toInt()
            var isPrime = true

            when {
                num == 1 -> isPrime = false
                else -> {
                    for (i in 2 until num) {
                        if (num % i == 0) {
                            isPrime = false
                            break
                        }
                    }
                }
            }

            if (isPrime)
                primeCnt++
        }

        print(primeCnt)
    }
}