package leetcode.problem0042

import kotlin.test.Test
import kotlin.test.assertEquals

internal class TrappingRainWaterTest {
    private val target = TrappingRainWater()

    @Test
    fun test1() {
        assertEquals(6, target.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
    }

    @Test
    fun test2() {
        assertEquals(9, target.trap(intArrayOf(4, 2, 0, 3, 2, 5)))
    }
}
