fun main() {
    println(BiValued.Solution().solution(intArrayOf(4, 2, 2, 4, 2)))
}

object BiValued {
    class Solution {
        fun solution(A: IntArray): Int {
            val arrLen = A.size
            if (arrLen < 2) {
                return arrLen
            }
            val a = intArrayOf(0, A[0])
            val b = intArrayOf(1, A[1])
            var nowLen = 2
            var maxLen = nowLen
            for (i in 2 until A.size) {
                val newVal = A[i]
                if (newVal == a[1]) {
                    a[0] = i
                    nowLen++
                } else if (newVal == b[1]) {
                    b[0] = i
                    nowLen++
                } else {
                    if (A[i - 1] == a[1]) {
                        nowLen = i - b[0]
                        b[0] = i
                        b[1] = newVal
                    } else {
                        nowLen = i - a[0]
                        a[0] = i
                        a[1] = newVal
                    }
                }
                if (maxLen < nowLen) {
                    maxLen = nowLen
                }
            }
            return maxLen
        }
    }
}