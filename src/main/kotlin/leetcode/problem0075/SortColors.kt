package leetcode.problem0075

class SortColors {
    fun sortColors(nums: IntArray) {
        val countArray = IntArray(3) { 0 }

        nums.forEach {
            countArray[it]++
        }

        nums.indices.forEach { index ->
            nums[index] = when {
                index < countArray[0] -> 0
                index < countArray[0] + countArray[1] -> 1
                else -> 2
            }
        }
    }
}
