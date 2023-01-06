package leetcode.problem0111

import leetcode.shared.TreeNode
import kotlin.math.min

class MinimumDepthOfBinaryTree {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val leftHDepth = minDepth(root.left)
        val rightDepth = minDepth(root.right)
        return when {
            leftHDepth == 0 -> 1 + rightDepth
            rightDepth == 0 -> 1 + leftHDepth
            else -> 1 + min(leftHDepth, rightDepth)
        }
    }
}
