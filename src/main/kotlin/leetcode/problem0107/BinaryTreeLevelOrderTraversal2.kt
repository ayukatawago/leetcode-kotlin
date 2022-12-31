package leetcode.problem0107

import leetcode.shared.TreeNode
import java.util.LinkedList

class BinaryTreeLevelOrderTraversal2 {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return emptyList()
        }

        val resultList = LinkedList<ArrayList<Int>>()

        val queue = LinkedList<TreeNode>().apply {
            add(root)
        }

        while (queue.isNotEmpty()) {
            val level = arrayListOf<Int>()
            queue.indices.forEach { _ ->
                val node = queue.removeLast()
                level.add(node.`val`)
                if (node.left != null) {
                    queue.push(node.left)
                }
                if (node.right != null) {
                    queue.push(node.right)
                }
            }

            resultList.addFirst(level)
        }

        return resultList
    }
}
