package leetcode.problem0075

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SortColorsTest {
    private val target = SortColors()

    @Test
    fun test1() {
        val nums = intArrayOf(2, 0, 2, 1, 1, 0)
        target.sortColors(nums)
        assertEquals(
            listOf(0, 0, 1, 1, 2, 2),
            nums.toList()
        )
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 0, 1)
        target.sortColors(nums)
        assertEquals(
            listOf(0, 1, 2),
            nums.toList()
        )
    }
}
