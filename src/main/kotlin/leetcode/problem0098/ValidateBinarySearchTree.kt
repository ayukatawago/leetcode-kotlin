package leetcode.problem0098

import leetcode.shared.TreeNode

class ValidateBinarySearchTree {
    fun isValidBST(root: TreeNode?): Boolean {
        return hasValidNode(root, Int.MIN_VALUE.toLong() - 1, Int.MAX_VALUE.toLong() + 1)
    }

    private fun hasValidNode(root: TreeNode?, minValue: Long, maxValue: Long): Boolean {
        if (root == null) {
            return true
        }

        val rootValue = root.`val`.toLong()
        if (rootValue <= minValue || rootValue >= maxValue) {
            return false
        }

        return hasValidNode(root.left, minValue, rootValue) && hasValidNode(root.right, rootValue, maxValue)
    }
}
