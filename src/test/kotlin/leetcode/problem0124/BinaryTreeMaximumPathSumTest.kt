package leetcode.problem0124

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryTreeMaximumPathSumTest {
    private val target = BinaryTreeMaximumPathSum()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(1, 2, 3))
        assertEquals(6, target.maxPathSum(root))
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(-10, 9, 20, null, null, 15, 7))
        assertEquals(42, target.maxPathSum(root))
    }

    @Test
    fun test3() {
        val root = TreeNode.of(arrayOf(-3))
        assertEquals(-3, target.maxPathSum(root))
    }

    @Test
    fun test4() {
        val root = TreeNode.of(arrayOf(2, -1))
        assertEquals(2, target.maxPathSum(root))
    }

    @Test
    fun test5() {
        val root = TreeNode.of(arrayOf(1, 2))
        assertEquals(3, target.maxPathSum(root))
    }

    @Test
    fun test6() {
        val root = TreeNode.of(arrayOf(1, -2, -3, 1, 3, -2, null, -1))
        assertEquals(3, target.maxPathSum(root))
    }
}
