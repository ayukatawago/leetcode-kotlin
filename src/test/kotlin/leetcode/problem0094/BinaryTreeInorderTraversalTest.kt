package leetcode.problem0094

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BinaryTreeInorderTraversalTest {
    private val target = BinaryTreeInorderTraversal()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(1, null, 2, 3))
        assertEquals(
            listOf(1, 3, 2),
            target.inorderTraversal(root)
        )
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf())
        assertEquals(
            listOf(),
            target.inorderTraversal(root)
        )
    }

    @Test
    fun test3() {
        val root = TreeNode.of(arrayOf(1))
        assertEquals(
            listOf(1),
            target.inorderTraversal(root)
        )
    }
}
