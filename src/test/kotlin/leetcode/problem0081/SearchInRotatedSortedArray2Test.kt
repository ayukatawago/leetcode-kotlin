package leetcode.problem0081

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SearchInRotatedSortedArray2Test {
    private val target = SearchInRotatedSortedArray2()

    @Test
    fun test1() {
        val nums = intArrayOf(2, 5, 6, 0, 0, 1, 2)
        assertTrue(target.search(nums, 0))
        assertTrue(target.search(nums, 1))
        assertTrue(target.search(nums, 2))
        assertTrue(target.search(nums, 5))
        assertTrue(target.search(nums, 6))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 5, 6, 0, 0, 1, 2)
        assertFalse(target.search(nums, 3))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 0, 1, 1, 1)
        assertTrue(target.search(nums, 0))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        assertTrue(target.search(nums, 13))
    }

    @Test
    fun test5() {
        val nums = intArrayOf(1, 3, 5)
        assertTrue(target.search(nums, 1))
        assertTrue(target.search(nums, 3))
        assertTrue(target.search(nums, 5))
    }

    @Test
    fun test6() {
        val nums = intArrayOf(3, 5, 1)
        assertTrue(target.search(nums, 1))
        assertTrue(target.search(nums, 3))
        assertTrue(target.search(nums, 5))
    }

    @Test
    fun test7() {
        val nums = intArrayOf(5, 1, 3)
        assertTrue(target.search(nums, 1))
        assertTrue(target.search(nums, 3))
        assertTrue(target.search(nums, 5))
    }

    @Test
    fun test8() {
        val nums = intArrayOf(3, 1, 2, 2, 2)
        assertTrue(target.search(nums, 1))
    }
}
