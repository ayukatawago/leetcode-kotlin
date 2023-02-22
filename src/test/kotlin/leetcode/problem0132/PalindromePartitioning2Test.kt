package leetcode.problem0132

import kotlin.test.Test
import kotlin.test.assertEquals

class PalindromePartitioning2Test {
    private val target = PalindromePartitioning2()

    @Test
    fun test1() {
        assertEquals(1, target.minCut("aab"))
    }

    @Test
    fun test2() {
        assertEquals(0, target.minCut("a"))
    }

    @Test
    fun test3() {
        assertEquals(1, target.minCut("ab"))
    }

    @Test
    fun test4() {
        assertEquals(0, target.minCut("aba"))
    }

    @Test
    fun test5() {
        assertEquals(1, target.minCut("abacdedc"))
    }
}
