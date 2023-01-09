package leetcode.problem0113

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PathSum2Test {
    private val target = PathSum2()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1))
        assertEquals(
            setOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5)),
            target.pathSum(root, 22).toSet()
        )
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(1, 2, 3))
        assertTrue(target.pathSum(root, 5).isEmpty())
    }

    @Test
    fun test3() {
        val root = TreeNode.of(arrayOf())
        assertTrue(target.pathSum(root, 5).isEmpty())
    }
}
