package leetcode.problem0099

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RecoverBinarySearchTreeTest {
    private val target = RecoverBinarySearchTree()

    @Test
    fun test1() {
        val input: Array<Int?> = arrayOf(1, 3, null, null, 2)
        val treeNode = TreeNode.of(input)
        target.recoverTree(treeNode)

        assertEquals(
            listOf(3, 1, null, null, 2),
            treeNode?.toList()
        )
    }

    @Test
    fun test2() {
        val input: Array<Int?> = arrayOf(3, 1, 4, null, null, 2)
        val treeNode = TreeNode.of(input)
        target.recoverTree(treeNode)

        assertEquals(
            listOf(2, 1, 4, null, null, 3),
            treeNode?.toList()
        )
    }

    @Test
    fun test3() {
        val input: Array<Int?> = arrayOf(1, 2)
        val treeNode = TreeNode.of(input)
        target.recoverTree(treeNode)

        assertEquals(
            listOf(2, 1),
            treeNode?.toList()
        )
    }

    @Test
    fun test4() {
        val input: Array<Int?> = arrayOf(10, 8, 40, 4, 60, 9, 80)
        val treeNode = TreeNode.of(input)
        target.recoverTree(treeNode)

        assertEquals(
            listOf(10, 8, 40, 4, 9, 60, 80),
            treeNode?.toList()
        )
    }
}
