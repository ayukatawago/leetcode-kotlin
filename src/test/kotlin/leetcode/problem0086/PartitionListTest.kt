package leetcode.problem0086

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class PartitionListTest {
    private val target = PartitionList()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(1, 4, 3, 2, 5, 2))
        assertEquals(
            listOf(1, 2, 2, 4, 3, 5),
            target.partition(head, 3)?.toList()
        )
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf(2, 1))
        assertEquals(
            listOf(1, 2),
            target.partition(head, 2)?.toList()
        )
    }
}
