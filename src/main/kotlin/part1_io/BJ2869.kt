package part1_io

class BJ2869 {
    fun main() = with(System.`in`.bufferedReader()) {
        val (a, b, v) = readLine().split(" ").map { it.toInt() }
        val delta = a - b
        val goal = v - a

        val day = when {
            v <= a        -> 0
            goal <= delta -> 1
            else -> {
                when {
                    goal % delta == 0 -> goal / delta
                    else              -> goal / delta + 1
                }
            }
        }

        print(day + 1)
    }
}