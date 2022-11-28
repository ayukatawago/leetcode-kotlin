package leetcode.problem0105

import leetcode.shared.TreeNode

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.size != inorder.size) {
            throw IllegalArgumentException()
        }

        if (preorder.isEmpty()) {
            return null
        }

        val leftSize = inorder.indexOf(preorder[0])
        val leftInorder = inorder.slice(0 until leftSize).toIntArray()
        val rightInorder = inorder.slice(leftSize + 1 .. preorder.lastIndex).toIntArray()

        val leftPreorder = preorder.slice(1..leftSize).toIntArray()
        val rightPreorder = preorder.slice(leftSize + 1..preorder.lastIndex).toIntArray()

        return TreeNode(preorder[0]).apply {
            left = buildTree(leftPreorder, leftInorder)
            right = buildTree(rightPreorder, rightInorder)
        }
    }
}
