package leetcode.problem0053

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MaximumSubarrayTest {
    private val target = MaximumSubarray()

    @Test
    fun test1() {
        assertEquals(6, target.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun test2() {
        assertEquals(1, target.maxSubArray(intArrayOf(1)))
    }

    @Test
    fun test3() {
        assertEquals(23, target.maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
    }
}
