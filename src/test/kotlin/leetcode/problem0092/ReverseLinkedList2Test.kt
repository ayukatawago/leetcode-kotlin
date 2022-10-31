package leetcode.problem0092

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ReverseLinkedList2Test {
    private val target = ReverseLinkedList2()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(1, 2, 3, 4, 5))
        assertEquals(
            listOf(1, 4, 3, 2, 5),
            target.reverseBetween(head, 2, 4)?.toList()
        )
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf(5))
        assertEquals(
            listOf(5),
            target.reverseBetween(head, 1, 1)?.toList()
        )
    }

    @Test
    fun test3() {
        val head = ListNode.from(listOf(1, 2, 3, 4, 5))
        assertEquals(
            listOf(4, 3, 2, 1, 5),
            target.reverseBetween(head, 1, 4)?.toList()
        )
    }

    @Test
    fun test4() {
        val head = ListNode.from(listOf(1, 2, 3, 4, 5))
        assertEquals(
            listOf(1, 2, 5, 4, 3),
            target.reverseBetween(head, 3, 5)?.toList()
        )
    }
}
