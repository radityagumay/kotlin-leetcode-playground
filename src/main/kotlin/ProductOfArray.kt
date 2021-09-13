// https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/827/

fun main() {
    val array = intArrayOf(1, 2, 3, 4)
    val result = ProductOfArray().productExceptSelf(array)
    println("$result")
}

class ProductOfArray {
    fun productExceptSelf(nums: IntArray): IntArray {
        val product = IntArray(nums.size)
        var runningProduct = 1

        for (i in nums.indices) {
            product[i] = runningProduct
            runningProduct *= nums[i]
        }

        runningProduct = 1
        for (i in (nums.size) - 1 downTo 0) {
            product[i] *= runningProduct
            runningProduct *= nums[i]
        }

        return product
    }
}