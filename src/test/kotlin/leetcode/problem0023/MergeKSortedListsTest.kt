package leetcode.problem0023

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MergeKSortedListsTest {
    private val target = MergeKSortedLists()

    @Test
    fun test1() {
        val lists = arrayOf(ListNode.from(listOf(1, 4, 5)), ListNode.from(listOf(1, 3, 4)), ListNode.from(listOf(2, 6)))
        assertEquals(listOf(1, 1, 2, 3, 4, 4, 5, 6), target.mergeKLists(lists)?.toList())
    }

    @Test
    fun test2() {
        val lists = arrayOf<ListNode?>()
        assertEquals(listOf(), target.mergeKLists(lists)?.toList() ?: emptyList())
    }

    @Test
    fun test3() {
        val lists = arrayOf(ListNode.from(listOf()))
        assertEquals(listOf(), target.mergeKLists(lists)?.toList() ?: emptyList())
    }
}
