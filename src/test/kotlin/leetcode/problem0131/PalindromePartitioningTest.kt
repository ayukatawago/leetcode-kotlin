package leetcode.problem0131

import kotlin.test.Test
import kotlin.test.assertEquals

class PalindromePartitioningTest {
    private val target = PalindromePartitioning()

    @Test
    fun test1() {
        assertEquals(
            setOf(listOf("a", "a", "b"), listOf("aa", "b")),
            target.partition("aab").toSet()
        )
    }

    @Test
    fun test2() {
        assertEquals(
            setOf(listOf("a")),
            target.partition("a").toSet()
        )
    }
}
