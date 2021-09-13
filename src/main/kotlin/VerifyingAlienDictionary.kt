fun main() {
    val inputs = listOf(
        arrayOf("hello", "leetcode") to "hlabcdefgijkmnopqrstuvwxyz"
    )

    for ((i, j) in inputs) {
        println(VerifyingAlienDictionary.Solution().isAlienSorted(i, j))
    }
}

object VerifyingAlienDictionary {
    class Solution {
        fun isAlienSorted(words: Array<String>, order: String): Boolean {
            val mapping = IntArray(26)
            var seq = 0
            for (c in order.toCharArray()) {
                mapping[c - 'a'] = seq++
            }

            for (w in words.indices - 1) {
                val curr: String = words[w]
                val next = words[w + 1]
                val len = Math.min(curr.length, next.length)

                if (len != curr.length && len == next.length && curr.startsWith(next)) {
                    return false
                }

                for (i in 0 until len) {
                    if (mapping[curr[i] - 'a'] > mapping[next[i] - 'a']) {
                        return false
                    }

                    if (mapping[curr[i] - 'a'] < mapping[next[i] - 'a']) {
                        break
                    }

                }
            }
            return true
        }
    }
}