package leetcode.problem0110

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BalancedBinaryTreeTest {
    private val target = BalancedBinaryTree()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(3, 9, 20, null, null, 15, 7))
        assertTrue(target.isBalanced(root))
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(1, 2, 2, 3, 3, null, null, 4, 4))
        assertFalse(target.isBalanced(root))
    }

    @Test
    fun test3() {
        val root = TreeNode.of(emptyArray())
        assertTrue(target.isBalanced(root))
    }

    @Test
    fun test4() {
        val root = TreeNode.of(arrayOf(1, 2, 2, 3, null, null, 3, 4, null, null, 4))
        assertFalse(target.isBalanced(root))
    }
}
