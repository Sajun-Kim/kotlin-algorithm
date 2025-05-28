package part1_io

class BJ2588 {
    fun main() = with(System.`in`.bufferedReader()) {
        val a = readLine().toInt()
        val b = readLine()

        b.reversed().forEach {
            println(a * it.digitToInt())
        }
        print(a * b.toInt())
    }
}