package leetcode.problem0120

import kotlin.test.Test
import kotlin.test.assertEquals

internal class TriangleTest {
    private val target = Triangle()

    @Test
    fun test1() {
        val triangle = listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))
        assertEquals(11, target.minimumTotal(triangle))
    }

    @Test
    fun test2() {
        val triangle = listOf(listOf(-10))
        assertEquals(-10, target.minimumTotal(triangle))
    }

    @Test
    fun test3() {
        val triangle = listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, -100))
        assertEquals(-87, target.minimumTotal(triangle))
    }
}
