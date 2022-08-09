package leetcode.problem0029

import kotlin.test.Test
import kotlin.test.assertEquals

internal class DivideTwoIntegersTest {
    private val target = DivideTwoIntegers()

    @Test
    fun test1() {
        assertEquals(3, target.divide(10, 3))
        assertEquals(4, target.divide(16, 4))
    }

    @Test
    fun test2() {
        assertEquals(-2, target.divide(7, -3))
        assertEquals(-4, target.divide(16, -4))
    }

    @Test
    fun test3() {
        assertEquals(-3, target.divide(-11, 3))
        assertEquals(-4, target.divide(-16, 4))
    }

    @Test
    fun test4() {
        assertEquals(3, target.divide(-11, -3))
        assertEquals(4, target.divide(-16, -4))
    }

    @Test
    fun test5() {
        assertEquals(2147483647, target.divide(-2147483648, -1))
        assertEquals(-2147483648, target.divide(-2147483648, 1))
    }

    @Test
    fun test6() {
        assertEquals(0, target.divide(1038925803, -2147483648))
    }

    @Test
    fun test7() {
        assertEquals(715827882, target.divide(2147483647, 3))
        assertEquals(1000000000, target.divide(1000000000, 1))
    }
}
