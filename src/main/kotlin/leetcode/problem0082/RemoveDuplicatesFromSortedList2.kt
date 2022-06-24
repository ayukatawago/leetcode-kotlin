package leetcode.problem0082

import leetcode.shared.ListNode

class RemoveDuplicatesFromSortedList2 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        val hashMap = LinkedHashMap<Int, Int>()

        var pointer = head
        while (pointer != null) {
            hashMap[pointer.`val`] = if (hashMap.containsKey(pointer.`val`)) {
                requireNotNull(hashMap[pointer.`val`]) + 1
            } else {
                1
            }

            pointer = pointer.next
        }

        val dummyHead = ListNode(0)
        pointer = dummyHead
        hashMap.entries.forEach {
            if (it.value == 1) {
                requireNotNull(pointer).next = ListNode(it.key)
                pointer = requireNotNull(pointer).next
            }
        }

        return dummyHead.next
    }
}
