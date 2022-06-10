package leetcode.problem0086

import leetcode.shared.ListNode

class PartitionList {
    fun partition(head: ListNode?, x: Int): ListNode? {
        val dummyNode = ListNode(0)
        val rightNode = ListNode(0)

        var leftPointer = dummyNode
        var rightPointer = rightNode
        var pointer = head
        while (pointer != null) {
            if (pointer.`val` < x) {
                leftPointer.next = ListNode(pointer.`val`).also {
                    leftPointer = it
                }
            } else {
                rightPointer.next = ListNode(pointer.`val`).also {
                    rightPointer = it
                }
            }
            pointer = pointer.next
        }
        leftPointer.next = rightNode.next

        return dummyNode.next
    }
}
