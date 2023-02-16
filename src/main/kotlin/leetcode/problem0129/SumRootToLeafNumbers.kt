package leetcode.problem0129

import leetcode.shared.TreeNode

class SumRootToLeafNumbers {
    fun sumNumbers(root: TreeNode?): Int {
        if (root == null) return 0

        return root.getNumString().fold(0) { sum, num -> sum + num.toInt() }
    }

    private fun TreeNode.getNumString(): List<String> {
        if (left == null && right == null) return listOf(`val`.toString())

        return (left?.getNumString().orEmpty() + right?.getNumString().orEmpty()).map {
            `val`.toString() + it
        }
    }
}
