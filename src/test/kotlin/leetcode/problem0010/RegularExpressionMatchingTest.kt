package leetcode.problem0010

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RegularExpressionMatchingTest {
    private val target = RegularExpressionMatching()

    @Test
    fun test_1() {
        assertFalse(target.isMatch("aa", "a"))
    }

    @Test
    fun test_2() {
        assertTrue(target.isMatch("aa", "a*"))
    }

    @Test
    fun test_3() {
        assertTrue(target.isMatch("ab", ".*"))
    }

    @Test
    fun test_4() {
        assertTrue(target.isMatch("abc", "a.c"))
    }

    @Test
    fun test_5() {
        assertTrue(target.isMatch("aaa", "a*"))
    }

    @Test
    fun test_6() {
        assertTrue(target.isMatch("a", "a*"))
    }

    @Test
    fun test_7() {
        assertTrue(target.isMatch("aab", "c*a*b"))
    }

    @Test
    fun test_8() {
        assertTrue(target.isMatch("a", "ab*"))
    }

    @Test
    fun test_9() {
        assertFalse(target.isMatch("mississippi", "mis*is*p*."))
    }

    @Test
    fun text_10() {
        assertFalse(target.isMatch("ab", ".*c"))
    }

    @Test
    fun text_11() {
        assertFalse(target.isMatch("aaa", "aaaa"))
    }

    @Test
    fun test_12() {
        assertFalse(target.isMatch("a", "ab*a"))
    }

    @Test
    fun test_13() {
        assertTrue(target.isMatch("aaa", "a*a"))
    }

    @Test
    fun test_14() {
        assertTrue(target.isMatch("aaaaab", "a*ab"))
    }

    @Test
    fun test_15() {
        assertTrue(target.isMatch("aa", "aa"))
    }

    @Test
    fun test_16() {
        assertTrue(target.isMatch("aaa", "ab*a*c*a"))
    }

    @Test
    fun test_17() {
        assertFalse { target.isMatch("a", ".*..a*") }
    }
}
