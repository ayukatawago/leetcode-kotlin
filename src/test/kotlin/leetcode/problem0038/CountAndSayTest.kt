package leetcode.problem0038

import kotlin.test.Test
import kotlin.test.assertEquals

internal class CountAndSayTest {
    private val target = CountAndSay()

    @Test
    fun test1() {
        assertEquals("1", target.countAndSay(1))
    }

    @Test
    fun test2() {
        assertEquals("1211", target.countAndSay(4))
    }
}
