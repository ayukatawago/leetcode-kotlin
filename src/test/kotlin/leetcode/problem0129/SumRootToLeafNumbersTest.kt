package leetcode.problem0129

import leetcode.shared.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SumRootToLeafNumbersTest {
    private val target = SumRootToLeafNumbers()

    @Test
    fun test1() {
        val root = TreeNode.of(arrayOf(1, 2, 3))
        assertEquals(25, target.sumNumbers(root))
    }

    @Test
    fun test2() {
        val root = TreeNode.of(arrayOf(4, 9, 0, 5, 1))
        assertEquals(1026, target.sumNumbers(root))
    }
}
