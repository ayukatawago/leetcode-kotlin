package leetcode.problem0113

import leetcode.shared.TreeNode

class PathSum2 {
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        if (root == null) return emptyList()

        if (root.left == null && root.right == null && root.`val` == targetSum) {
            return listOf(listOf(root.`val`))
        }

        val fromLeft = pathSum(root.left, targetSum - root.`val`).map { listOf(root.`val`) + it }
        val fromRight = pathSum(root.right, targetSum - root.`val`).map { listOf(root.`val`) + it }

        return fromLeft + fromRight
    }
}
