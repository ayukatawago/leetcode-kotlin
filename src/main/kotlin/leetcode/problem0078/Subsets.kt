package leetcode.problem0078

class Subsets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        if (nums.size == 1) {
            answer.add(listOf())
            answer.add(listOf(nums[0]))
        } else {
            subsets(nums.copyOfRange(1, nums.size)).forEach {
                answer.add(it)
                answer.add(listOf(nums[0]) + it)
            }
        }
        return answer
    }
}
