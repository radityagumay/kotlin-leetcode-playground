fun main() {
    println(MissingNumber.solution(intArrayOf(1, 2, 3)))
}

object MissingNumber {
    fun solution(A: IntArray): Int {
        var flag = 1
        val a = A.sortedArray()
        for (i in a.indices) {
            if (a[i] <= 0) {
                continue
            } else if (a[i] == flag) {
                flag++
            }
        }

        return flag
    }
}