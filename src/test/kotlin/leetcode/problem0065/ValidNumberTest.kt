package leetcode.problem0065

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ValidNumberTest {
    private val target = ValidNumber()

    @Test
    fun test1() {
        assertTrue(target.isNumber("0"))
        assertTrue(target.isNumber("2"))
        assertTrue(target.isNumber("0089"))
        assertTrue(target.isNumber("-0.1"))
        assertTrue(target.isNumber("+3.14"))
        assertTrue(target.isNumber("4."))
        assertTrue(target.isNumber("-.9"))
        assertTrue(target.isNumber("2e10"))
        assertTrue(target.isNumber("-90E3"))
        assertTrue(target.isNumber("3e+7"))
        assertTrue(target.isNumber("+6e-1"))
        assertTrue(target.isNumber("53.5e93"))
        assertTrue(target.isNumber("0"))
        assertTrue(target.isNumber("-123.456e789"))
    }

    @Test
    fun test2() {
        assertFalse(target.isNumber("e"))
        assertFalse(target.isNumber("."))
        assertFalse(target.isNumber("abc"))
        assertFalse(target.isNumber("1a"))
        assertFalse(target.isNumber("1e"))
        assertFalse(target.isNumber("e3"))
        assertFalse(target.isNumber("99e2.5"))
        assertFalse(target.isNumber("--6"))
        assertFalse(target.isNumber("e"))
        assertFalse(target.isNumber("-+3"))
        assertFalse(target.isNumber("95a53e53"))
    }
}
