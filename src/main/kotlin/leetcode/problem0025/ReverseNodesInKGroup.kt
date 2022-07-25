package leetcode.problem0025

import leetcode.shared.ListNode
import java.util.Stack

class ReverseNodesInKGroup {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if (head == null) {
            return null
        }

        var nodeLength = 0
        var nodePointer: ListNode? = head
        while (nodePointer != null) {
            nodeLength++
            nodePointer = nodePointer.next
        }

        val dummyHead = ListNode(0)
        var answerNodePointer: ListNode = dummyHead
        nodePointer = head
        var remainingNodeCount = nodeLength

        while (remainingNodeCount >= k) {
            val stack = Stack<Int>()
            for (nodeCount in 0 until k) {
                if (nodePointer == null) {
                    break
                }
                stack.push(nodePointer.`val`)
                remainingNodeCount--
                nodePointer = nodePointer.next
            }

            while (true) {
                if (stack.isEmpty()) {
                    break
                }
                val value = stack.pop()
                answerNodePointer.next = ListNode(value)
                answerNodePointer = requireNotNull(answerNodePointer.next)
            }
        }
        for (nodeCount in 0 until remainingNodeCount) {
            requireNotNull(nodePointer)
            answerNodePointer.next = ListNode(nodePointer.`val`)
            answerNodePointer = requireNotNull(answerNodePointer.next)
            nodePointer = nodePointer.next
        }

        return dummyHead.next
    }
}
