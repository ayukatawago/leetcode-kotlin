package leetcode.problem0044

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class WildcardMatchingTest {
    private val target = WildcardMatching()

    @Test
    fun test1() {
        assertFalse(target.isMatch("aa", "a"))
    }

    @Test
    fun test2() {
        assertTrue(target.isMatch("aa", "*"))
    }

    @Test
    fun test3() {
        assertFalse(target.isMatch("cb", "?a"))
    }

    @Test
    fun test4() {
        assertTrue(target.isMatch("cb", "?b"))
    }

    @Test
    fun test5() {
        assertTrue(target.isMatch("adceb", "*a*b"))
    }

    @Test
    fun test6() {
        assertFalse(target.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a***b"))
    }

    @Test
    fun test7() {
        assertFalse(target.isMatch("mississippi", "m??*ss*?i*pi"))
    }
}
