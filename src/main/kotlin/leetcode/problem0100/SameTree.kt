package leetcode.problem0100

import leetcode.shared.TreeNode

class SameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
        when {
            p == null && q == null -> true
            p == null || q == null -> false
            p.`val` != q.`val` -> false
            else -> isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
}
