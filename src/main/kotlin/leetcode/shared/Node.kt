package leetcode.shared

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null

    fun toList(): List<Any> {
        val mutableList = mutableListOf<Any>()
        var leftNode: Node? = this
        while (leftNode != null) {
            var node: Node? = leftNode
            while (node != null) {
                mutableList.add(node.`val`)
                node = node.next
            }
            mutableList.add('#')
            leftNode = leftNode.left
        }

        return mutableList
    }
    private fun insert(index: Int, input: Array<Int?>) {
        if (2 * index + 1 < input.size) {
            input[2 * index + 1]?.let {
                left = Node(it).also { node ->
                    node.insert(2 * index + 1, input)
                }
            }
        }
        if (2 * index + 2 < input.size) {
            input[2 * index + 2]?.let {
                right = Node(it).also { node ->
                    node.insert(2 * index + 2, input)
                }
            }
        }
    }

    companion object {
        fun from(input: Array<Int?>): Node? {
            if (input.isEmpty()) {
                return null
            }
            val first = input[0] ?: return null
            val rootNode = Node(first)
            rootNode.insert(0, input)
            return rootNode
        }
    }
}
