package leetcode.problem0002

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        requireNotNull(l1)
        requireNotNull(l2)
        var head: ListNode? = null
        var pointer: ListNode? = null
        var inputPointer1 = l1
        var inputPointer2 = l2
        var shouldAddNext = false
        while (inputPointer1 != null || inputPointer2 != null || shouldAddNext) {
            val sum = (inputPointer1?.`val` ?: 0) + (inputPointer2?.`val` ?: 0) + if(shouldAddNext) 1 else 0
            shouldAddNext = sum / 10 > 0
            if (head == null) {
                head = ListNode(sum.rem(10))
                pointer = head
            } else {
                requireNotNull(pointer)
                pointer.next = ListNode(sum.rem(10))
                pointer = pointer.next
            }
            inputPointer1 = inputPointer1?.next
            inputPointer2 = inputPointer2?.next
        }
        return head
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
