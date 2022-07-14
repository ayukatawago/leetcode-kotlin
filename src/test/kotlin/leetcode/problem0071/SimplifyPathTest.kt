package leetcode.problem0071

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SimplifyPathTest {
    private val target = SimplifyPath()

    @Test
    fun test1() {
        assertEquals("/home", target.simplifyPath("/home/"))
    }

    @Test
    fun test2() {
        assertEquals("/", target.simplifyPath("/../"))
    }

    @Test
    fun test3() {
        assertEquals("/home/foo", target.simplifyPath("/home//foo/"))
    }

    @Test
    fun test4() {
        assertEquals("/c", target.simplifyPath("/a/./b/../../c/"))
    }

    @Test
    fun test5() {
        assertEquals("/a/b/c", target.simplifyPath("/a//b////c/d//././/.."))
    }
}
