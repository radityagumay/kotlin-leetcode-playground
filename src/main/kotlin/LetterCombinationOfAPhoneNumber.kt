fun main() {
    println(LetterCombinationOfAPhoneNumber.Solution().letterCombinations("234"))
}

object LetterCombinationOfAPhoneNumber {
    class Solution {
        fun letterCombinations(digits: String): List<String> {
            if (digits.isEmpty()) return emptyList()

            var result = mutableListOf<String>()
            val keys = mutableMapOf(
                '2' to "abc",
                '3' to "def",
                '4' to "ghi",
                '5' to "jkl",
                '6' to "mno",
                '7' to "pqrs",
                '8' to "tuv",
                '9' to "wxyz"
            )
            result.add("")
            for (d in digits.toCharArray()) {
                val list = mutableListOf<String>()
                for (comb in result) {
                    for (c in keys[d]!!.toCharArray()) {
                        list.add(comb + c)
                    }
                }
                result = list
            }
            return result
        }
    }
}