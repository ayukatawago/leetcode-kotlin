package leetcode.problem0109

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ConvertSortedListToBinarySearchTreeTest {
    private val target = ConvertSortedListToBinarySearchTree()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(-10, -3, 0, 5, 9))

        assertEquals(
            listOf(0, -3, 9, -10, null, 5),
            target.sortedListToBST(head)?.toList()
        )
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf())

        assertNull(target.sortedListToBST(head))
    }
}
