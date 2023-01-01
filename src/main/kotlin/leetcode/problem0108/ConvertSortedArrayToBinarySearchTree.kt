package leetcode.problem0108

import leetcode.shared.TreeNode

class ConvertSortedArrayToBinarySearchTree {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) {
            return null
        }

        val center = nums[nums.size / 2]
        return TreeNode(center).apply {
            left = sortedArrayToBST(nums.sliceArray(0 until nums.size / 2))
            right = sortedArrayToBST(nums.sliceArray((nums.size / 2 + 1)..nums.lastIndex))
        }
    }
}
