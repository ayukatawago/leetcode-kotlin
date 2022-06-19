package leetcode.problem0019

import leetcode.shared.ListNode

class RemoveNthNode {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        requireNotNull(head)
        var size = 0
        var headPointer: ListNode? = head
        while (headPointer != null) {
            headPointer = headPointer.next
            size++
        }

        var listNode: ListNode? = null
        var pointer: ListNode? = null
        var counter = 0
        headPointer = head
        while (headPointer != null) {
            if (counter == size - n) {
                headPointer = headPointer.next
                counter++
                continue
            }
            if (pointer == null) {
                listNode = ListNode(headPointer.`val`)
                pointer = listNode
            } else {
                pointer.next = ListNode(headPointer.`val`)
                pointer = pointer.next
            }
            headPointer = headPointer.next
            counter++
        }

        return listNode
    }
}
