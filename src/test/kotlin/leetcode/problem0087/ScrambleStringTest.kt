package leetcode.problem0087

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ScrambleStringTest {
    private val target = ScrambleString()

    @Test
    fun test1() {
        assertTrue(target.isScramble("great", "rgeat"))
    }

    @Test
    fun test2() {
        assertFalse(target.isScramble("abcde", "caebd"))
    }

    @Test
    fun test3() {
        assertTrue(target.isScramble("a", "a"))
    }

    @Test
    fun test4() {
        assertFalse(target.isScramble("eebaacbcbcadaaedceaaacadccd", "eadcaacabaddaceacbceaabeccd"))
    }
}
