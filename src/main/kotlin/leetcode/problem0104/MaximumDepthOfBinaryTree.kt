package leetcode.problem0104

import leetcode.shared.TreeNode
import kotlin.math.max

class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val left = maxDepth(root.left)
        val right = maxDepth(root.right)

        return 1 + max(left, right)
    }
}
