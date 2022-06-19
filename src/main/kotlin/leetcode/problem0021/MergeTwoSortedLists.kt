package leetcode.problem0021

import leetcode.shared.ListNode

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }

        var pointer1 = list1
        var pointer2 = list2
        val answer = mutableListOf<Int>()
        while (pointer1 != null || pointer2 != null) {
            when {
                pointer1 == null -> {
                    requireNotNull(pointer2)
                    answer.add(pointer2.`val`)
                    pointer2 = pointer2.next
                }
                pointer2 == null -> {
                    answer.add(pointer1.`val`)
                    pointer1 = pointer1.next
                }
                pointer1.`val` <= pointer2.`val` -> {
                    answer.add(pointer1.`val`)
                    pointer1 = pointer1.next
                }
                else -> {
                    answer.add(pointer2.`val`)
                    pointer2 = pointer2.next
                }
            }
        }
        return ListNode.from(answer)
    }
}
