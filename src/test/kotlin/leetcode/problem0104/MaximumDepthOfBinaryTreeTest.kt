package leetcode.problem0104

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MaximumDepthOfBinaryTreeTest {
    private val target = MaximumDepthOfBinaryTree()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(3, 9, 20, null, null, 15, 7))
        assertEquals(3, target.maxDepth(root))
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(1, null, 2))
        assertEquals(2, target.maxDepth(root))
    }
}
