package leetcode.problem0102

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BinaryTreeLevelOrderTraversalTest {
    private val target = BinaryTreeLevelOrderTraversal()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(3, 9, 20, null, null, 15, 7))
        assertEquals(
            listOf(listOf(3), listOf(9, 20), listOf(15, 7)),
            target.levelOrder(root)
        )
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(1))
        assertEquals(
            listOf(listOf(1)),
            target.levelOrder(root)
        )
    }

    @Test
    fun test3() {
        val root = TreeNode.of(arrayOf())
        assertEquals(
            listOf(),
            target.levelOrder(root)
        )
    }

    @Test
    fun test4() {
        val root = TreeNode.of(arrayOf(1, 2, 3, 4, 5))
        assertEquals(
            listOf(listOf(1), listOf(2, 3), listOf(4, 5)),
            target.levelOrder(root)
        )
    }
}
