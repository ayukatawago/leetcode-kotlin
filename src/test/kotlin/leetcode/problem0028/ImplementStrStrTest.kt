package leetcode.problem0028

import kotlin.test.Test
import kotlin.test.assertEquals

internal class ImplementStrStrTest {
    private val target = ImplementStrStr()

    @Test
    fun test1() {
        assertEquals(2, target.strStr("hello", "ll"))
    }

    @Test
    fun test2() {
        assertEquals(-1, target.strStr("aaaaa", "bba"))
    }

    @Test
    fun test3() {
        assertEquals(0, target.strStr("aaa", "a"))
    }
}
