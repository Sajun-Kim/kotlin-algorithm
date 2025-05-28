class BJ1152 {
    fun main() = with(System.`in`.bufferedReader()) {
        val str = readLine().trimStart().trimEnd().split(' ')
        if (str == listOf(""))
            print('0')
        else
            print(str.size)
    }
}