fun main() {
    println(TwoSum.Solution().twoSum(intArrayOf(2, 7, 11, 15), 9))
}

object TwoSum {
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray? {
            val map: MutableMap<Int, Int> = HashMap()
            for (i in nums.indices) {
                val required = target - nums[i]
                if (map.containsKey(required)) {
                    return intArrayOf(map[required]!!, i)
                }
                map[nums[i]] = i
            }
            return null
        }
    }
}