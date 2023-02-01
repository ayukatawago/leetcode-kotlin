package leetcode.problem0124

import leetcode.shared.TreeNode

class BinaryTreeMaximumPathSum {
    fun maxPathSum(root: TreeNode?): Int {
        var maxSum = Int.MIN_VALUE

        fun solve(node: TreeNode?): Int {
            if (node == null) return 0
            val leftMax = maxOf(0, solve(node.left))
            val rightMax = maxOf(0, solve(node.right))
            maxSum = maxOf(maxSum, leftMax + node.`val` + rightMax)
            return node.`val` + maxOf(leftMax, rightMax)
        }
        solve(root)
        return maxSum
    }
}
