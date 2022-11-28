package leetcode.problem0007

import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseIntegerTest {
    private val target = ReverseInteger()

    @Test
    fun test_1() {
        val input = 123
        assertEquals(321, target.reverse(input))
    }

    @Test
    fun test_2() {
        val input = -123
        assertEquals(-321, target.reverse(input))
    }

    @Test
    fun test_3() {
        val input = 120
        assertEquals(21, target.reverse(input))
    }

    @Test
    fun test_4() {
        val input = 1534236469
        assertEquals(0, target.reverse(input))
    }
}
