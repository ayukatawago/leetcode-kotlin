package leetcode.problem0013

import kotlin.test.Test
import kotlin.test.assertEquals

class RomanToIntegerTest {
    private val target = RomanToInteger()

    @Test
    fun test_1() {
        assertEquals(3, target.romanToInt("III"))
    }

    @Test
    fun test_2() {
        assertEquals(58, target.romanToInt("LVIII"))
    }

    @Test
    fun test_3() {
        assertEquals(1994, target.romanToInt("MCMXCIV"))
    }
}
