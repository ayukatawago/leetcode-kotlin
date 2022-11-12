package leetcode.problem0099

import leetcode.shared.TreeNode

class RecoverBinarySearchTree {
    private var previousNode: TreeNode = TreeNode(Int.MIN_VALUE) // Assign dummy node
    private lateinit var firstProblemNode: TreeNode
    private lateinit var lastProblemNode: TreeNode

    private var isFirstNodeAssigned = false

    fun recoverTree(root: TreeNode?) {
        inorderTraversal(root)

        val tempValue = firstProblemNode.`val`
        firstProblemNode.`val` = lastProblemNode.`val`
        lastProblemNode.`val` = tempValue
    }

    private fun inorderTraversal(root: TreeNode?) {
        if (root == null) return

        inorderTraversal(root.left)

        if (previousNode.`val` > root.`val`) {
            if (!isFirstNodeAssigned) {
                firstProblemNode = previousNode
                isFirstNodeAssigned = true
            }
            lastProblemNode = root
        }

        previousNode = root

        inorderTraversal(root.right)
    }
}
