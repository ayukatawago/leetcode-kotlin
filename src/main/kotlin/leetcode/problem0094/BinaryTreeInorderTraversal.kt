package leetcode.problem0094

import leetcode.shared.TreeNode
import java.util.Stack

class BinaryTreeInorderTraversal {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()

        var node: TreeNode? = root
        val answer = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        while (node != null || stack.isNotEmpty()) {
            if (node != null) {
                stack.push(node)
                node = node.left
            } else {
                node = stack.pop()
                answer.add(node.`val`)
                node = node.right
            }
        }
        return answer
    }
}
