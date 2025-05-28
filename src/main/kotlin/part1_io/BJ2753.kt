package part1_io

class BJ2753 {
    fun main() = with(System.`in`.bufferedReader()) {
        val year = readLine().toInt()

        print(when {
            year % 4 == 0 && year % 100 != 0 || year % 400 == 0 -> 1
            else -> 0
        })
    }
}