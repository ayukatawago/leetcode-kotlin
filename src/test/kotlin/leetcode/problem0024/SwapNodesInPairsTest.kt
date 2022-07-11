package leetcode.problem0024

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SwapNodesInPairsTest {
    private val target = SwapNodesInPairs()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(1, 2, 3, 4))
        assertEquals(listOf(2, 1, 4, 3), target.swapPairs(head)?.toList())
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf())
        assertEquals(emptyList(), target.swapPairs(head)?.toList() ?: emptyList())
    }

    @Test
    fun test3() {
        val head = ListNode.from(listOf(1))
        assertEquals(listOf(1), target.swapPairs(head)?.toList())
    }

    @Test
    fun test4() {
        val head = ListNode.from(listOf(1, 2))
        assertEquals(listOf(2, 1), target.swapPairs(head)?.toList())
    }

    @Test
    fun test5() {
        val head = ListNode.from(listOf(1, 2, 3))
        assertEquals(listOf(2, 1, 3), target.swapPairs(head)?.toList())
    }
}
