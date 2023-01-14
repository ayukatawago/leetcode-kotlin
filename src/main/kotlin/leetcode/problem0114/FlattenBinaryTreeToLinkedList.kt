package leetcode.problem0114

import leetcode.shared.TreeNode

class FlattenBinaryTreeToLinkedList {
    fun flatten(root: TreeNode?) {
        if (root == null) return

        flatten(root.left)
        flatten(root.right)

        val right = root.right
        val left = root.left ?: return
        root.right = left
        var node = left
        while (node.right != null) {
            node = node.right!!
        }
        node.right = right
        root.left = null
    }
}
