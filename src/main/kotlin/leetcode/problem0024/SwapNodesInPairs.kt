package leetcode.problem0024

import leetcode.shared.ListNode

class SwapNodesInPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        val dummyHead = ListNode(0)
        var answerPointerNode = dummyHead
        var orgPointerNode: ListNode? = head

        while (orgPointerNode != null) {
            val swappedNode = swap(orgPointerNode)
            answerPointerNode.next = swappedNode
            if (swappedNode.next == null) {
                break
            }
            answerPointerNode = swappedNode.next!!
            orgPointerNode = orgPointerNode.next?.next
        }

        return dummyHead.next
    }

    private fun swap(node: ListNode): ListNode {
        val nextNode = node.next ?: return node
        val head = ListNode(nextNode.`val`)
        head.next = ListNode(node.`val`)
        return head
    }
}
