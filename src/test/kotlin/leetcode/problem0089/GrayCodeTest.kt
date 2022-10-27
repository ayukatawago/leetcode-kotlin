package leetcode.problem0089

import kotlin.test.Test
import kotlin.test.assertEquals

internal class GrayCodeTest {
    private val target = GrayCode()

    @Test
    fun test1() {
        assertEquals(listOf(0, 1), target.grayCode(1))
    }

    @Test
    fun test2() {
        assertEquals(listOf(0, 1, 3, 2), target.grayCode(2))
    }

    @Test
    fun test3() {
        assertEquals(listOf(0, 1, 3, 2, 6, 7, 5, 4), target.grayCode(3))
    }

    @Test
    fun test4() {
        assertEquals(listOf(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8), target.grayCode(4))
    }
}
