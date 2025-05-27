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
                    'O' -> score++
                    'X' -> score = 0
                }
                sum += score
            }
            println(sum)
        }
    }
}