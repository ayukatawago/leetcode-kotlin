package leetcode.problem0025

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ReverseNodesInKGroupTest {
    private val target = ReverseNodesInKGroup()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(1, 2, 3, 4, 5))
        assertEquals(listOf(2, 1, 4, 3, 5), target.reverseKGroup(head, 2)?.toList())
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf(1, 2, 3, 4, 5))
        assertEquals(listOf(3, 2, 1, 4, 5), target.reverseKGroup(head, 3)?.toList())
    }

    @Test
    fun test3() {
        val head = ListNode.from(listOf(1, 2))
        assertEquals(listOf(2, 1), target.reverseKGroup(head, 2)?.toList())
    }
}
