package part1_io

import kotlin.text.iterator

class BJ8958 {
    fun main() = with(System.`in`.bufferedReader()) {
        val i = readLine().toInt()

        val oxResult = mutableListOf<String>()
        repeat(i) {
            oxResult.add(readLine())
        }

        for (result in oxResult) {
            var sum = 0
            var score = 0
            for (it in result) {
                when (it) {
                    'O' -> {
                        score++
                        sum += score
                    }
                    'X' -> score = 0
                }
            }
            println(sum)
        }
    }
}