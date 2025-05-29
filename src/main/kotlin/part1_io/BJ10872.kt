package part1_io

class BJ10872 {
    fun main() = with(System.`in`.bufferedReader()) {
        val n = readLine().toInt()

        var result = 1
        for (i in 2..n)
            result *= i

        print(result)
    }
}