package leetcode.problem0100

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SameTreeTest {
    private val target = SameTree()

    @Test
    fun test1() {
        val p = TreeNode.from(arrayOf(1, 2, 3))
        val q = TreeNode.from(arrayOf(1, 2, 3))
        assertTrue(target.isSameTree(p, q))
    }

    @Test
    fun test2() {
        val p = TreeNode.from(arrayOf(1, 2))
        val q = TreeNode.from(arrayOf(1, null, 2))
        assertFalse(target.isSameTree(p, q))
    }

    @Test
    fun test3() {
        val p = TreeNode.from(arrayOf(1, 2, 1))
        val q = TreeNode.from(arrayOf(1, 1, 2))
        assertFalse(target.isSameTree(p, q))
    }
}
