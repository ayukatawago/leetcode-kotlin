package leetcode.problem0061

import leetcode.shared.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RotateListTest {
    private val target = RotateList()

    @Test
    fun test1() {
        val head = ListNode.from(listOf(1, 2, 3, 4, 5))
        assertEquals(
            listOf(4, 5, 1, 2, 3),
            target.rotateRight(head, 2)?.toList()
        )
    }

    @Test
    fun test2() {
        val head = ListNode.from(listOf(0, 1, 2))
        assertEquals(
            listOf(2, 0, 1),
            target.rotateRight(head, 4)?.toList()
        )
    }

    @Test
    fun test3() {
        val head = ListNode.from(listOf(1, 2))
        assertEquals(
            listOf(2, 1),
            target.rotateRight(head, 1)?.toList()
        )
    }
}
