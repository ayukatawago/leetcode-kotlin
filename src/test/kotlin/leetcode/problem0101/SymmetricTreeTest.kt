package leetcode.problem0101

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SymmetricTreeTest {
    private val target = SymmetricTree()

    @Test
    fun test1() {
        val input: Array<Int?> = arrayOf(1, 2, 2, 3, 4, 4, 3)
        val treeNode = TreeNode.of(input)

        assertTrue(target.isSymmetric(treeNode))
    }

    @Test
    fun test2() {
        val input: Array<Int?> = arrayOf(1, 2, 2, null, 3, null, 3)
        val treeNode = TreeNode.of(input)

        assertFalse(target.isSymmetric(treeNode))
    }
}
