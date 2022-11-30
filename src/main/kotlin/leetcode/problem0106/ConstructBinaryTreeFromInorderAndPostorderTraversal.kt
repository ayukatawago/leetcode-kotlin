package leetcode.problem0106

import leetcode.shared.TreeNode

class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        return buildTree(inorder.indices, postorder.indices, inorder, postorder)
    }

    private fun buildTree(inorderRange: IntRange, postorderRange: IntRange, inorder: IntArray, postorder: IntArray): TreeNode {
        if (inorderRange.count() != postorderRange.count()) {
            throw IllegalArgumentException()
        }

        val rootValue = postorder[postorderRange.last]

        val inoderIndex = inorder.indexOf(rootValue)

        val leftInorderRange = if (inorderRange.first < inoderIndex) {
            inorderRange.first until inoderIndex
        } else {
            null
        }
        val rightInorderRange = if (inoderIndex < inorderRange.last) {
            (inoderIndex + 1)..inorderRange.last
        } else {
            null
        }

        val leftPostorderRange = if (leftInorderRange != null) {
            (postorderRange.first)until(postorderRange.first + leftInorderRange.count())
        } else {
            null
        }
        val rightPostorderRange = if (rightInorderRange != null) {
            (postorderRange.last - rightInorderRange.count()) until postorderRange.last
        } else {
            null
        }

        val leftTree = if (leftInorderRange != null && leftPostorderRange != null) {
            buildTree(leftInorderRange, leftPostorderRange, inorder, postorder)
        } else {
            null
        }

        val rightTree = if (rightInorderRange != null && rightPostorderRange != null) {
            buildTree(rightInorderRange, rightPostorderRange, inorder, postorder)
        } else {
            null
        }

        return TreeNode(rootValue).apply {
            left = leftTree
            right = rightTree
        }
    }
}
