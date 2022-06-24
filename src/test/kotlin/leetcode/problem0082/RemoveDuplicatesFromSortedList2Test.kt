package leetcode.problem0082

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RemoveDuplicatesFromSortedList2Test {
    private val target = RemoveDuplicatesFromSortedList2()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(1, 2, 3, 3, 4, 4, 5))
        assertEquals(
            listOf(1, 2, 5),
            target.deleteDuplicates(head)?.toList()
        )
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf(1, 1, 1, 2, 3))
        assertEquals(
            listOf(2, 3),
            target.deleteDuplicates(head)?.toList()
        )
    }
}
