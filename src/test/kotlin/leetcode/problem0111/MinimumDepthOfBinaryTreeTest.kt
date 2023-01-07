package leetcode.problem0111

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumDepthOfBinaryTreeTest {
    private val target = MinimumDepthOfBinaryTree()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(3, 9, 20, null, null, 15, 7))
        assertEquals(2, target.minDepth(root))
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(2, null, 3, null, 4, null, 5, null, 6))
        assertEquals(5, target.minDepth(root))
    }
}
