package leetcode.problem0021

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class MergeTwoSortedListsTest {
    private val target = MergeTwoSortedLists()

    @Test
    fun test1() {
        assertEquals(
            listOf(1, 1, 2, 3, 4, 4),
            target.mergeTwoLists(ListNode.from(listOf(1, 2, 4)), ListNode.from(listOf(1, 3, 4)))?.toList()
        )
    }

    @Test
    fun test2() {
        assertNull(target.mergeTwoLists(ListNode.from(listOf()), ListNode.from(listOf())))
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(0),
            target.mergeTwoLists(ListNode.from(listOf()), ListNode.from(listOf(0)))?.toList()
        )
    }
}
