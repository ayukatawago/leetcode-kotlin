package leetcode.problem0084

import kotlin.test.Test
import kotlin.test.assertEquals

internal class LargestRectangleInHistogramTest {
    private val target = LargestRectangleInHistogram()

    @Test
    fun test1() {
        val heights = intArrayOf(2, 1, 5, 6, 2, 3)
        assertEquals(10, target.largestRectangleArea(heights))
    }

    @Test
    fun test2() {
        val heights = intArrayOf(2, 4)
        assertEquals(4, target.largestRectangleArea(heights))
    }

    @Test
    fun test3() {
        val heights = intArrayOf(1, 1)
        assertEquals(2, target.largestRectangleArea(heights))
    }

    @Test
    fun test4() {
        val heights = intArrayOf(1, 2, 2)
        assertEquals(4, target.largestRectangleArea(heights))
    }

    @Test
    fun test5() {
        val heights = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(9, target.largestRectangleArea(heights))
    }
}
