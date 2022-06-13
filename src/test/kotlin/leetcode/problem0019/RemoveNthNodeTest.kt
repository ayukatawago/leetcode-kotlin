package leetcode.problem0019

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

internal class RemoveNthNodeTest {
    private val target = RemoveNthNode()

    @Test
    fun test1() {
        exec(listOf(1, 2, 3, 4, 5), 2, listOf(1, 2, 3, 5))
    }

    @Test
    fun test2() {
        exec(listOf(1), 1, listOf())
    }

    @Test
    fun test3() {
        exec(listOf(1, 2), 1, listOf(1))
    }

    private fun exec(input: List<Int>, n: Int, output: List<Int>) {
        val listNode = input.toListNode()
        val result = target.removeNthFromEnd(listNode, n)
        if (output.isEmpty()) {
            assertNull(result)
        } else {
            assertNotNull(result)
            assertEquals(output, result.toList())
        }
    }

    private fun List<Int>.toListNode(): ListNode? {
        if (isEmpty()) {
            return null
        }
        val head = ListNode(get(0))
        var pointer: ListNode = head
        drop(1).forEach {
            pointer.next = ListNode(it)
            pointer = pointer.next!!
        }
        return head
    }
}
