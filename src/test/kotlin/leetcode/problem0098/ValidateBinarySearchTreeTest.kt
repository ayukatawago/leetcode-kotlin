package leetcode.problem0098

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ValidateBinarySearchTreeTest {
    private val target = ValidateBinarySearchTree()

    @Test
    fun test1() {
        val input: Array<Int?> = arrayOf(2, 1, 3)
        val treeNode = TreeNode.of(input)

        assertTrue(target.isValidBST(treeNode))
    }

    @Test
    fun test2() {
        val input: Array<Int?> = arrayOf(5, 1, 4, null, null, 3, 6)
        val treeNode = TreeNode.of(input)

        assertFalse(target.isValidBST(treeNode))
    }

    @Test
    fun test3() {
        val input: Array<Int?> = arrayOf(2, 2, 2)
        val treeNode = TreeNode.of(input)

        assertFalse(target.isValidBST(treeNode))
    }

    @Test
    fun test4() {
        val input: Array<Int?> = arrayOf(5, 4, 6, null, null, 3, 7)
        val treeNode = TreeNode.of(input)

        assertFalse(target.isValidBST(treeNode))
    }

    @Test
    fun test5() {
        val input: Array<Int?> = arrayOf(3, 1, 5, 0, 2, 4, 6)
        val treeNode = TreeNode.of(input)

        assertTrue(target.isValidBST(treeNode))
    }

    @Test
    fun test6() {
        val input: Array<Int?> = arrayOf(3, 1, 5, 0, 2, 4, 6, null, null, null, 3)
        val treeNode = TreeNode.of(input)

        assertFalse(target.isValidBST(treeNode))
    }

    @Test
    fun test7() {
        val input: Array<Int?> = arrayOf(2147483647)
        val treeNode = TreeNode.of(input)

        assertTrue(target.isValidBST(treeNode))
    }
}
