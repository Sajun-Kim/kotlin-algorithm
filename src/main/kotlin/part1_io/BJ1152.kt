package part1_io

import java.util.StringTokenizer

class BJ1152 {
    fun main() = with(System.`in`.bufferedReader()) {
        print(StringTokenizer(readLine()).countTokens())
    }
}