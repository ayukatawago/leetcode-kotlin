package leetcode.problem0106

import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    private val target = ConstructBinaryTreeFromInorderAndPostorderTraversal()

    @Test
    fun test1() {
        val inorder = intArrayOf(9, 3, 15, 20, 7)
        val postorder = intArrayOf(9, 15, 7, 20, 3)

        assertEquals(
            listOf(3, 9, 20, null, null, 15, 7),
            target.buildTree(inorder, postorder)?.toList()
        )
    }

    @Test
    fun test2() {
        val inorder = intArrayOf(-1)
        val postorder = intArrayOf(-1)

        assertEquals(
            listOf(-1),
            target.buildTree(inorder, postorder)?.toList()
        )
    }
}
