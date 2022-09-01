package leetcode.problem0043

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MultiplyStringsTest {
    private val target = MultiplyStrings()

    @Test
    fun test1() {
        assertEquals("6", target.multiply("2", "3"))
    }

    @Test
    fun test2() {
        assertEquals("56088", target.multiply("123", "456"))
    }

    @Test
    fun test3() {
        assertEquals("0", target.multiply("0", "0"))
    }

    @Test
    fun test4() {
        assertEquals("121932631112635269", target.multiply("123456789", "987654321"))
    }
//
//    @Test
//    fun test5() {
//        assertEquals("419254329864656431168468", target.multiply("498828660196", "840477629533"))
//    }
}
