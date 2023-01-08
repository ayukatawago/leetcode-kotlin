package leetcode.problem0112

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PathSumTest {
    private val target = PathSum()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1))
        assertTrue(target.hasPathSum(root, 22))
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(1, 2, 3))
        assertFalse(target.hasPathSum(root, 5))
    }

    @Test
    fun test3() {
        val root = TreeNode.of(arrayOf())
        assertFalse(target.hasPathSum(root, 0))
    }
}
