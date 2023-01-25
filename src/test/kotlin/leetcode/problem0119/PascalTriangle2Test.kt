package leetcode.problem0119

import kotlin.test.Test
import kotlin.test.assertEquals

class PascalTriangle2Test {
    private val target = PascalTriangle2()

    @Test
    fun test1() {
        assertEquals(listOf(1), target.getRow(0))
    }

    @Test
    fun test2() {
        assertEquals(listOf(1, 1), target.getRow(1))
    }

    @Test
    fun test3() {
        assertEquals(listOf(1, 2, 1), target.getRow(2))
    }

    @Test
    fun test4() {
        assertEquals(listOf(1, 3, 3, 1), target.getRow(3))
    }

    @Test
    fun test5() {
        assertEquals(listOf(1, 4, 6, 4, 1), target.getRow(4))
    }
}
