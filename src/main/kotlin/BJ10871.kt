import java.util.StringTokenizer

class BJ10871 {
    fun main() = with(System.`in`.bufferedReader()) {
        var token = StringTokenizer(readLine())
        val n = token.nextToken().toInt()
        val x = token.nextToken().toInt()

        token = StringTokenizer(readLine())
        for (i in 0 until n) {
            val num = token.nextToken().toInt()
            if (num < x)
                print("$num ")
        }
    }
}