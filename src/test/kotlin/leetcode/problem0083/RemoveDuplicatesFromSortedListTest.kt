package leetcode.problem0083

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RemoveDuplicatesFromSortedListTest {
    private val target = RemoveDuplicatesFromSortedList()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(1, 1, 2))
        assertEquals(
            listOf(1, 2),
            target.deleteDuplicates(head)?.toList()
        )
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf(1, 1, 2, 3, 3))
        assertEquals(
            listOf(1, 2, 3),
            target.deleteDuplicates(head)?.toList()
        )
    }
}
