package leetcode.problem0012

import kotlin.test.Test
import kotlin.test.assertEquals

class IntegerToRomanTest {
    private val target = IntegerToRoman()

    @Test
    fun test_1() {
        assertEquals("III", target.intToRoman(3))
    }

    @Test
    fun test_2() {
        assertEquals("LVIII", target.intToRoman(58))
    }

    @Test
    fun test_3() {
        assertEquals("MCMXCIV", target.intToRoman(1994))
    }

    @Test
    fun test_4() {
        assertEquals("IV", target.intToRoman(4))
    }

    @Test
    fun test_5() {
        assertEquals("IX", target.intToRoman(9))
    }
}
