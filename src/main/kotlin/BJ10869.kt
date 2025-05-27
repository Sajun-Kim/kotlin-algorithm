class BJ10869 {
    fun main() = with(System.`in`.bufferedReader()) {
        val (a, b) = readLine().split(" ")
        val intA = a.toInt()
        val intB = b.toInt()

        println(intA + intB)
        println(intA - intB)
        println(intA * intB)
        println(intA / intB)
        println(intA % intB)
    }
}