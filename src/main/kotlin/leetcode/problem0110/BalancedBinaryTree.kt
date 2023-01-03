package leetcode.problem0110

import leetcode.shared.TreeNode
import kotlin.math.abs
import kotlin.math.max

class BalancedBinaryTree {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true

        return root.height() != -1
    }

    /**
     * Returns -1 when the TreeNode is not height balanced.
     */
    private fun TreeNode.height(): Int {
        val leftHeight = left?.height() ?: 0
        val rightHeight = right?.height() ?: 0
        if (leftHeight == -1 || rightHeight == -1) {
            return -1
        }
        if (abs(leftHeight - rightHeight) > 1) {
            return -1
        }
        return 1 + max(leftHeight, rightHeight)
    }
}
