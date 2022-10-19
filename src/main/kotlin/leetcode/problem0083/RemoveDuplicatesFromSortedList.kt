package leetcode.problem0083

import leetcode.shared.ListNode

class RemoveDuplicatesFromSortedList {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        val hashSet = LinkedHashSet<Int>()

        var pointer = head
        while (pointer != null) {
            hashSet.add(pointer.`val`)

            pointer = pointer.next
        }

        val dummyHead = ListNode(0)
        pointer = dummyHead
        hashSet.forEach {
            requireNotNull(pointer).next = ListNode(it)
            pointer = requireNotNull(pointer).next
        }

        return dummyHead.next
    }
}
