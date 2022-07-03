package leetcode.problem0023

import leetcode.shared.ListNode

class MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }

        val head = ListNode(0)
        var answer = head

        while (lists.mapNotNull { it }.isNotEmpty()) {
            val (minIndex, minValue) = lists.map { listNode -> listNode?.`val` }.findMin()
            answer.next = ListNode(minValue)
            answer = answer.next!!

            lists[minIndex] = lists[minIndex]?.next
        }

        return head.next
    }

    private fun List<Int?>.findMin(): Pair<Int, Int> {
        var minIndex = 0
        var minValue = Int.MAX_VALUE
        forEachIndexed { index, i ->
            if (i == null) {
                return@forEachIndexed
            }
            if (i < minValue) {
                minValue = i
                minIndex = index
            }
        }
        return minIndex to minValue
    }
}
