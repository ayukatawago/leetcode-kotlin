package leetcode.problem0019

import leetcode.shared.ListNode
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
        val listNode = ListNode.from(input)
        val result = target.removeNthFromEnd(listNode, n)
        if (output.isEmpty()) {
            assertNull(result)
        } else {
            assertNotNull(result)
            assertEquals(output, result.toList())
        }
    }
}
