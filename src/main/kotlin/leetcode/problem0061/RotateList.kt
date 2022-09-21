package leetcode.problem0061

import leetcode.shared.ListNode

class RotateList {
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (k == 0 || head == null || head.next == null) {
            return head
        }
        // Get length of ListNode
        var lastNode = head
        var length = 1
        while (lastNode?.next != null) {
            lastNode = lastNode.next
            length++
        }
        val rotation = k % length

        // Connect head to the last node
        lastNode?.next = head

        var count = 0
        var answerHead = head
        while (count < length - rotation) {
            requireNotNull(answerHead)
            answerHead = answerHead.next
            count++
        }

        count = 0
        lastNode = answerHead
        while (count < length - 1) {
            requireNotNull(lastNode)
            lastNode = lastNode.next
            count++
        }
        lastNode?.next = null

        return answerHead
    }
}
