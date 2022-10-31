package leetcode.problem0092

import leetcode.shared.ListNode
import java.util.Stack

class ReverseLinkedList2 {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head == null) {
            return null
        }

        val reversedNode = ListNode(0)

        val stack = Stack<Int>()
        var index = 1
        var node = head
        var leftNode: ListNode? = null
        var rightNode: ListNode? = null

        while (node != null) {
            when (index) {
                in left..right -> stack.push(node.`val`)
                left - 1 -> leftNode = node
                right + 1 -> rightNode = node
            }

            node = node.next
            index++
        }

        node = reversedNode

        while (stack.isNotEmpty()) {
            requireNotNull(node)
            node.next = ListNode(stack.pop())

            node = node.next
        }

        node?.next = rightNode

        return if (leftNode == null) {
            reversedNode.next
        } else {
            leftNode.next = reversedNode.next
            head
        }
    }
}
