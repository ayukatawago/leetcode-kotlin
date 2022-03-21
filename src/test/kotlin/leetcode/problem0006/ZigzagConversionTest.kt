package leetcode.problem0006

import kotlin.test.Test
import kotlin.test.assertEquals

class ZigzagConversionTest {
    private val target = ZigzagConversion()

    @Test
    fun test1() {
        val input = "PAYPALISHIRING"
        assertEquals("PAHNAPLSIIGYIR", target.convert(input, 3))
    }

    @Test
    fun test2() {
        val input = "PAYPALISHIRING"
        assertEquals("PINALSIGYAHRPI", target.convert(input, 4))
    }

    @Test
    fun test3() {
        val input = "A"
        assertEquals("A", target.convert(input, 1))
    }
}