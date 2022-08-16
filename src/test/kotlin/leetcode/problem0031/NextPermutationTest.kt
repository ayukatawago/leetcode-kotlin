package leetcode.problem0031

import kotlin.test.Test
import kotlin.test.assertEquals

internal class NextPermutationTest {
    private val target = NextPermutation()

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        target.nextPermutation(nums)
        assertEquals(listOf(1, 3, 2), nums.toList())
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 2, 1)
        target.nextPermutation(nums)
        assertEquals(listOf(1, 2, 3), nums.toList())
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 5)
        target.nextPermutation(nums)
        assertEquals(listOf(1, 5, 1), nums.toList())
    }

    @Test
    fun test4() {
        val nums = intArrayOf(4, 3, 2, 1)
        target.nextPermutation(nums)
        assertEquals(listOf(1, 2, 3, 4), nums.toList())
    }

    @Test
    fun test5() {
        val nums = intArrayOf(1, 3, 2)
        target.nextPermutation(nums)
        assertEquals(listOf(2, 1, 3), nums.toList())
    }

    @Test
    fun test6() {
        val nums = intArrayOf(1, 5, 8, 4, 7, 6, 5, 3, 1)
        target.nextPermutation(nums)
        assertEquals(listOf(1, 5, 8, 5, 1, 3, 4, 6, 7), nums.toList())
    }
}
