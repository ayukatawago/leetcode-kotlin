package leetcode.problem0155

class MinStack {
    private var lastNode: Node? = null

    fun push(`val`: Int) {
        lastNode = if (lastNode == null) {
            Node(`val`, `val`, null)
        } else {
            Node(`val`, minOf(`val`, lastNode!!.minValue), lastNode)
        }
    }

    fun pop() {
        lastNode = lastNode?.previous
    }

    fun top(): Int = lastNode?.value ?: 0

    fun getMin(): Int = lastNode?.minValue ?: 0

    private class Node(val value: Int, var minValue: Int, var previous: Node?)
}
