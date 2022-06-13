package leetcode.problem0019

class RemoveNthNode {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        requireNotNull(head)
        var size = 0
        var headPointer: ListNode? = head
        while (headPointer != null) {
            headPointer = headPointer.next
            size++
        }

        var listNode: ListNode? = null
        var pointer: ListNode? = null
        var counter = 0
        headPointer = head
        while (headPointer != null) {
            if (counter == size - n) {
                headPointer = headPointer.next
                counter++
                continue
            }
            if (pointer == null) {
                listNode = ListNode(headPointer.`val`)
                pointer = listNode
            } else {
                pointer.next = ListNode(headPointer.`val`)
                pointer = pointer.next
            }
            headPointer = headPointer.next
            counter++
        }

        return listNode
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    fun toList(): List<Int> {
        val mutableList = mutableListOf<Int>()
        var pointer: ListNode? = this
        while (pointer != null) {
            mutableList.add(pointer.`val`)
            pointer = pointer.next
        }
        return mutableList
    }
}
