package leetcode.problem0026

import kotlin.test.Test
import kotlin.test.assertEquals

internal class RemoveDuplicatesFromSortedArrayTest {
    private val target = RemoveDuplicatesFromSortedArray()

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2)
        val expectedNums = intArrayOf(1, 2)
        testRule(nums, expectedNums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expectedNums = intArrayOf(0, 1, 2, 3, 4)
        testRule(nums, expectedNums)
    }

    private fun testRule(nums: IntArray, expected: IntArray) {
        val k = target.removeDuplicates(nums)
        assertEquals(expected.size, k)
        expected.indices.forEach {
            assertEquals(expected[it], nums[it])
        }
    }
}
