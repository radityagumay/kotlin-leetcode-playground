fun main() {
    AllSubsetsOfTheSet().set(intArrayOf(1, 2, 3))
}

class AllSubsetsOfTheSet {
    fun set(arrays: IntArray) {
        val set = mutableSetOf(setOf<Int>())
        arrays.forEach { next ->
            set += set.map { it + next }
        }
        println(set)
    }
}