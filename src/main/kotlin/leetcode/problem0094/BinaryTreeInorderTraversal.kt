package leetcode.problem0094

import leetcode.shared.TreeNode

class BinaryTreeInorderTraversal {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()

        return inorderTraversal(root.left) + listOf(root.`val`) + inorderTraversal(root.right)
    }
}
