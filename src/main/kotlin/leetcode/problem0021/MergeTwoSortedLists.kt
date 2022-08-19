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

        val dummyNode = ListNode(0)
        var answerPointer: ListNode? = dummyNode
        var pointer1: ListNode? = list1
        var pointer2: ListNode? = list2

        while (pointer1 != null || pointer2 != null) {
            answerPointer?.next = when {
                pointer1 == null -> {
                    requireNotNull(pointer2)
                    pointer2.also {
                        pointer2 = pointer2?.next
                    }
                }
                pointer2 == null -> {
                    pointer1.also {
                        pointer1 = pointer1?.next
                    }
                }
                requireNotNull(pointer1).`val` <= requireNotNull(pointer2).`val` -> {
                    pointer1.also {
                        pointer1 = pointer1?.next
                    }
                }
                else -> {
                    pointer2.also {
                        pointer2 = pointer2?.next
                    }
                }
            }
            answerPointer = answerPointer?.next
        }
        return dummyNode.next
    }
}
