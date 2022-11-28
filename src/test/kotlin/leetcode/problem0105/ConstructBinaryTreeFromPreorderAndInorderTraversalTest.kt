package leetcode.problem0105

import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    private val target = ConstructBinaryTreeFromPreorderAndInorderTraversal()

    @Test
    fun test1() {
        val preorder = intArrayOf(3, 9, 20, 15, 7)
        val inorder = intArrayOf(9, 3, 15, 20, 7)

        assertEquals(
            listOf(3, 9, 20, null, null, 15, 7),
            target.buildTree(preorder, inorder)?.toList()
        )
    }

    @Test
    fun test2() {
        val preorder = intArrayOf(-1)
        val inorder = intArrayOf(-1)

        assertEquals(
            listOf(-1),
            target.buildTree(preorder, inorder)?.toList()
        )
    }

    @Test
    fun test3() {
        val preorder = intArrayOf(3, 9, 1, 2, 20, 15, 7)
        val inorder = intArrayOf(1, 9, 2, 3, 15, 20, 7)

        assertEquals(
            listOf(3, 9, 20, 1, 2, 15, 7),
            target.buildTree(preorder, inorder)?.toList()
        )
    }
}
