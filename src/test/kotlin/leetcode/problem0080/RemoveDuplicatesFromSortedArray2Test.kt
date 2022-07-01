package leetcode.problem0080

import kotlin.test.Test
import kotlin.test.assertEquals

internal class RemoveDuplicatesFromSortedArray2Test {
    private val target = RemoveDuplicatesFromSortedArray2()

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        assertEquals(5, target.removeDuplicates(nums))
        assertEquals(
            listOf(1, 1, 2, 2, 3),
            nums.slice(0 until 5)
        )
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        assertEquals(7, target.removeDuplicates(nums))
        assertEquals(
            listOf(0, 0, 1, 1, 2, 3, 3),
            nums.slice(0 until 7)
        )
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3, 10, 10, 10, 10)
        assertEquals(9, target.removeDuplicates(nums))
        assertEquals(
            listOf(0, 0, 1, 1, 2, 3, 3, 10, 10),
            nums.slice(0 until 9)
        )
    }
}
