package leetcode.shared

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

    companion object {
        fun from(values: List<Int>): ListNode? {
            if (values.isEmpty()) {
                return null
            }
            val head = ListNode(values[0])
            values.drop(1).forEach {
                head.append(it)
            }

            return head
        }

        private fun ListNode.append(value: Int) {
            if (next != null) {
                next!!.append(value)
            } else {
                next = ListNode(value)
            }
        }
    }
}
