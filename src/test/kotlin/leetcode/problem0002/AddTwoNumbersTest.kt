import leetcode.problem0002.ListNode
import leetcode.problem0002.AddTwoNumbers
import kotlin.test.Test
import kotlin.test.assertEquals

class AddTwoNumbersTest {
    private val target = AddTwoNumbers()

    @Test
    fun test1() {
        val input1 = listOf(2, 4, 3)
        val input2 = listOf(5, 6, 4)
        val output = listOf(7, 0, 8)
        exec(input1, input2, output)
    }

    @Test
    fun test2() {
        val input1 = listOf(0)
        val input2 = listOf(0)
        val output = listOf(0)
        exec(input1, input2, output)
    }

    @Test
    fun test3() {
        val input1 = listOf(9, 9, 9, 9, 9, 9, 9)
        val input2 = listOf(9, 9, 9, 9)
        val output = listOf(8, 9, 9, 9, 0, 0, 0, 1)
        exec(input1, input2, output)
    }

    @Test
    fun test4() {
        val input1 = listOf(9)
        val input2 = listOf(1, 9, 9, 9, 9, 9, 9, 9, 9, 9)
        val output = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)
        exec(input1, input2, output)
    }

    @Test
    fun test5() {
        val input1 = listOf(8, 3, 2)
        val input2 = listOf(9, 2, 1)
        val output = listOf(7, 6, 3)
        exec(input1, input2, output)
    }

    private fun exec(input1: List<Int>, input2: List<Int>, output: List<Int>) {
        val listNode1 = input1.toListNode()
        val listNode2 = input2.toListNode()
        var result = target.addTwoNumbers(listNode1, listNode2)
        output.forEach {
            assertEquals(it, result?.`val`)
            result = result?.next
        }
    }

    private fun List<Int>.toListNode(): ListNode? {
        if (size == 0) {
            return null
        }
        val head = ListNode(get(0))
        drop(1).forEach {
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
