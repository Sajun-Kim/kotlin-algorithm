package part1_io

class BJ4344 {
    fun main() = with(System.`in`.bufferedReader()) {
        val c = readLine().toInt()
        for (i in 0 until c) {
            val line = readLine().split(" ")
            val n = line.first().toInt()

            var sum = 0
            for (i in 1..n)
                sum += line[i].toInt()

            val avg = sum / n.toFloat()
            var cnt = 0
            for (i in 1..n) {
                if (line[i].toFloat() > avg)
                    cnt++
            }
            val overAvgRatio = cnt / n.toFloat() * 100F
            println("${"%.3f".format(overAvgRatio)}%")
        }
    }
}