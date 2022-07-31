package leetcode.problem0027

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        nums.forEach {
            if (it == `val`) {
                return@forEach
            }
            nums[count] = it
            count++
        }
        return count
    }
}
