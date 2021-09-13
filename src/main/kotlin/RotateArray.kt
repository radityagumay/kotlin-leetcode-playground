fun main() {
    Solution().rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
}

class Solution {
    fun rotate(nums: IntArray, k: Int) {
        var k = k
        k %= nums.size
        if (k == 0 || nums.size == 1) return
        reverse(nums, nums.size - k, nums.size - 1)
        reverse(nums, 0, nums.size - k - 1)
        reverse(nums, 0, nums.size - 1)
    }

    companion object {
        fun reverse(nums: IntArray, i: Int, j: Int) {
            var left = i
            var right = j
            while (left < right) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
                right--
            }

            println("${nums.toList()}")
        }
    }
}
