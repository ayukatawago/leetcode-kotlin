package leetcode.problem0105

import leetcode.shared.TreeNode

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        return buildTree(0..preorder.lastIndex, 0..inorder.lastIndex, preorder, inorder)
    }

    private fun buildTree(
        preorderRange: IntRange,
        inorderRange: IntRange,
        preorder: IntArray,
        inorder: IntArray
    ): TreeNode {
        if (preorderRange.count() != inorderRange.count()) {
            throw IllegalArgumentException()
        }

        val rootValue = preorder[preorderRange.first]

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

        val leftPreorderRange = if (leftInorderRange != null) {
            (preorderRange.first + 1)..(preorderRange.first + leftInorderRange.count())
        } else {
            null
        }
        val rightPreorderRange = if (rightInorderRange != null) {
            (preorderRange.last - rightInorderRange.count() + 1)..preorderRange.last
        } else {
            null
        }

        val leftTree = if (leftInorderRange != null && leftPreorderRange != null) {
            buildTree(leftPreorderRange, leftInorderRange, preorder, inorder)
        } else {
            null
        }

        val rightTree = if (rightInorderRange != null && rightPreorderRange != null) {
            buildTree(rightPreorderRange, rightInorderRange, preorder, inorder)
        } else {
            null
        }

        return TreeNode(rootValue).apply {
            left = leftTree
            right = rightTree
        }
    }
}
