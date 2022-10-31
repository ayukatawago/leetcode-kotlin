package leetcode.problem0091

import kotlin.test.Test
import kotlin.test.assertEquals

internal class DecodeWaysTest {
    private val target = DecodeWays()

    @Test
    fun test1() {
        assertEquals(1, target.numDecodings("1"))
        assertEquals(1, target.numDecodings("10"))
        assertEquals(2, target.numDecodings("11"))
        assertEquals(2, target.numDecodings("12"))
        assertEquals(2, target.numDecodings("13"))
        assertEquals(2, target.numDecodings("14"))
        assertEquals(2, target.numDecodings("15"))
        assertEquals(2, target.numDecodings("16"))
        assertEquals(2, target.numDecodings("17"))
        assertEquals(2, target.numDecodings("18"))
        assertEquals(2, target.numDecodings("19"))
        assertEquals(1, target.numDecodings("20"))
        assertEquals(2, target.numDecodings("21"))
        assertEquals(2, target.numDecodings("22"))
        assertEquals(2, target.numDecodings("23"))
        assertEquals(2, target.numDecodings("24"))
        assertEquals(2, target.numDecodings("25"))
        assertEquals(2, target.numDecodings("26"))
        assertEquals(1, target.numDecodings("27"))
    }

    @Test
    fun test2() {
        assertEquals(3, target.numDecodings("226"))
        assertEquals(1, target.numDecodings("2102"))
    }

    @Test
    fun test3() {
        assertEquals(0, target.numDecodings("06"))
    }

    @Test
    fun test4() {
        assertEquals(1836311903, target.numDecodings("111111111111111111111111111111111111111111111"))
    }
}
