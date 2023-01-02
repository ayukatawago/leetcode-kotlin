package leetcode.problem0109

import leetcode.shared.ListNode
import leetcode.shared.TreeNode

class ConvertSortedListToBinarySearchTree {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        if (head == null) return null
        return sortedListToBST(head.toList())
    }

    private fun sortedListToBST(nums: List<Int>): TreeNode? {
        if (nums.isEmpty()) {
            return null
        }
        val center = nums[nums.size / 2]
        return TreeNode(center).apply {
            left = sortedListToBST(nums.slice(0 until nums.size / 2))
            right = sortedListToBST(nums.slice((nums.size / 2 + 1)..nums.lastIndex))
        }
    }
}
