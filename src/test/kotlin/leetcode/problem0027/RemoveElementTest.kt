package leetcode.problem0027

import kotlin.test.Test
import kotlin.test.assertEquals

internal class RemoveElementTest {
    private val target = RemoveElement()

    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 2, 3)
        val value = 3
        val expectedNums = intArrayOf(2, 2)
        assertResult(nums, value, expectedNums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4)
        val value = 2
        val expectedNums = intArrayOf(0, 0, 1, 3, 4)
        assertResult(nums, value, expectedNums)
    }

    private fun assertResult(nums: IntArray, value: Int, expectedNums: IntArray) {
        val k = target.removeElement(nums, value)
        assertEquals(expectedNums.size, k)
        nums.sort(0, k)
        println(nums.toList())
        for (i in 0 until k) {
            assertEquals(expectedNums[i], nums[i])
        }
    }
}
