package leetcode.problem0107

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryTreeLevelOrderTraversal2Test {
    private val target = BinaryTreeLevelOrderTraversal2()

    @Test
    fun test1() {
        val root = TreeNode.from(arrayOf(3, 9, 20, null, null, 15, 7))
        assertEquals(
            listOf(listOf(15, 7), listOf(9, 20), listOf(3)),
            target.levelOrderBottom(root)
        )
    }

    @Test
    fun test2() {
        val root = TreeNode.from(arrayOf(1))
        assertEquals(
            listOf(listOf(1)),
            target.levelOrderBottom(root)
        )
    }

    @Test
    fun test3() {
        val root = TreeNode.from(arrayOf())
        assertEquals(
            listOf(),
            target.levelOrderBottom(root)
        )
    }
}
