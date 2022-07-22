package leetcode.problem0070

import kotlin.test.Test
import kotlin.test.assertEquals

internal class ClimbingStairsTest {
    private val target = ClimbingStairs()

    @Test
    fun test1() {
        assertEquals(2, target.climbStairs(2))
    }

    @Test
    fun test2() {
        assertEquals(3, target.climbStairs(3))
    }

    @Test
    fun test3() {
        assertEquals(5, target.climbStairs(4))
    }
}
