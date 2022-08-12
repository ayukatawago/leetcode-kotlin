package leetcode.problem0046

class Permutations {
    fun permute(nums: IntArray): List<List<Int>> =
        if (nums.size == 1) {
            listOf(listOf(nums[0]))
        } else {
            nums.flatMap { i ->
                permute(nums.filterNot { it == i }.toIntArray()).map {
                    val tmpList = mutableListOf<Int>()
                    tmpList.add(i)
                    tmpList.addAll(it)
                    tmpList
                }
            }
        }
}
