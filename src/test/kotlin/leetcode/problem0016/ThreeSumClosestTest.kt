package leetcode.problem0016

import kotlin.test.Test
import kotlin.test.assertEquals

class ThreeSumClosestTest {
    private val target = ThreeSumClosest()

    @Test
    fun test1() {
        assertEquals(2, target.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1))
    }

    @Test
    fun test2() {
        assertEquals(0, target.threeSumClosest(intArrayOf(0, 0, 0), 1))
    }

    @Test
    fun test3() {
        assertEquals(2, target.threeSumClosest(intArrayOf(1, 1, 1, 0), -100))
    }

    @Test
    fun test4() {
        assertEquals(3, target.threeSumClosest(intArrayOf(0, 1, 2), 3))
    }
}
