package leetcode.problem0114

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class FlattenBinaryTreeToLinkedListTest {
    private val target = FlattenBinaryTreeToLinkedList()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(1, 2, 5, 3, 4, null, 6))
        target.flatten(root)
        assertEquals(
            listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6),
            root?.toList()
        )
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf())
        target.flatten(root)
        assertNull(root)
    }

    @Test
    fun test3() {
        val root = TreeNode.of(arrayOf(0))
        target.flatten(root)
        assertEquals(
            listOf(0),
            root?.toList()
        )
    }
}
