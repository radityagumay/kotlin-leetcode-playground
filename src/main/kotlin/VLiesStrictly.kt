fun main() {
    println(VLiesStrictly.solution(intArrayOf(1, 4, 7, 3, 3, 5)))
}

object VLiesStrictly {
    fun solution(A: IntArray): Int {
        val N = A.size
        var result = 0
        val pairs = mutableMapOf<Int, Int>()
        for (i in 0 until N) {
            pairs.put(A[i], i)
        }
        pairs.toSortedMap()
        var minOriginalPos = 0
        for ((a, b) in pairs) {
            minOriginalPos = Math.min(minOriginalPos, b)
            result = Math.max(result, b - minOriginalPos)
        }
        return result - 1
    }
}