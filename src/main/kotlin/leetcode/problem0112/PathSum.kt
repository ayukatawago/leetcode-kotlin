package leetcode.problem0112

import leetcode.shared.TreeNode

class PathSum {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        if (root.left == null && root.right == null && root.`val` == targetSum) {
            return true
        }

        return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}
