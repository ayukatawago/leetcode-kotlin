package leetcode.problem0101

import leetcode.shared.TreeNode

class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        return areSymmetricNodes(root.left, root.right)
    }

    private fun areSymmetricNodes(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null || right == null) {
            return left == right
        }

        if (left.`val` != right.`val`) {
            return false
        }

        return areSymmetricNodes(left.left, right.right) && areSymmetricNodes(left.right, right.left)
    }
}
