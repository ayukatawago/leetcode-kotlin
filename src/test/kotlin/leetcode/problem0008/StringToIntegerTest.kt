package leetcode.problem0008

import kotlin.test.Test
import kotlin.test.assertEquals

class StringToIntegerTest {
    private val target = StringToInteger()

    @Test
    fun test_1() {
        val input = "42"
        assertEquals(42, target.myAtoi(input))
    }

    @Test
    fun test_2() {
        val input = "   -42"
        assertEquals(-42, target.myAtoi(input))
    }

    @Test
    fun test_3() {
        val input = "4193 with words"
        assertEquals(4193, target.myAtoi(input))
    }

    @Test
    fun test_4() {
        val input = "words and 987"
        assertEquals(0, target.myAtoi(input))
    }

    @Test
    fun test_5() {
        val input = "-91283472332"
        assertEquals(Int.MIN_VALUE, target.myAtoi(input))
    }

    @Test
    fun test_6() {
        val input = "2147483648"
        assertEquals(2147483647, target.myAtoi(input))
    }

    @Test
    fun test_7() {
        val input = "2147483647"
        assertEquals(2147483647, target.myAtoi(input))
    }

    @Test
    fun test_8() {
        val input = "-2147483648"
        assertEquals(-2147483648, target.myAtoi(input))
    }

    @Test
    fun test_9() {
        val input = "-2147483647"
        assertEquals(-2147483647, target.myAtoi(input))
    }

    @Test
    fun test_10() {
        val input = "-2147483649"
        assertEquals(-2147483648, target.myAtoi(input))
    }

    @Test
    fun test_11() {
        val input = "20000000000000000000"
        assertEquals(2147483647, target.myAtoi(input))
    }

    @Test
    fun test_12() {
        val input = "  0000000000012345678"
        assertEquals(12345678, target.myAtoi(input))
    }

    @Test
    fun test_13() {
        val input = "00000-42a1234"
        assertEquals(0, target.myAtoi(input))
    }

    @Test
    fun test_14() {
        val input = "-9223372036854775809"
        assertEquals(-2147483648, target.myAtoi(input))
    }
}
