package leetcode.problem0103

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BinaryTreeZigzagLevelOrderTraversalTest {
    private val target = BinaryTreeZigzagLevelOrderTraversal()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(3, 9, 20, null, null, 15, 7))
        assertEquals(
            listOf(listOf(3), listOf(20, 9), listOf(15, 7)),
            target.zigzagLevelOrder(root)
        )
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(1))
        assertEquals(
            listOf(listOf(1)),
            target.zigzagLevelOrder(root)
        )
    }

    @Test
    fun test3() {
        val root = TreeNode.of(arrayOf())
        assertEquals(
            listOf(),
            target.zigzagLevelOrder(root)
        )
    }

    @Test
    fun test4() {
        val root = TreeNode.of(arrayOf(1, 2, 3, 4, 5))
        assertEquals(
            listOf(listOf(1), listOf(3, 2), listOf(4, 5)),
            target.zigzagLevelOrder(root)
        )
    }

    @Test
    fun test5() {
        val root = TreeNode.of(arrayOf(1, 2, 3, 4, null, null, 5))
        assertEquals(
            listOf(listOf(1), listOf(3, 2), listOf(4, 5)),
            target.zigzagLevelOrder(root)
        )
    }
}
