package leetcode.problem0116

class PopulatingNextRightPointers {
    fun connect(root: Node?): Node? {
        if (root == null) {
            return null
        }

        root.left?.let { left ->
            root.right?.let { right ->
                var tmpLeft = connect(left)
                var tmpRight = connect(right)
                while (tmpLeft != null) {
                    tmpLeft.next = tmpRight
                    tmpLeft = tmpLeft.right
                    tmpRight = tmpRight?.left
                }
            }
        }

        return root
    }
}

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null

    private fun insert(index: Int, input: Array<Int>) {
        if (2 * index + 1 < input.size) {
            input[2 * index + 1].let {
                left = Node(it).also { node ->
                    node.insert(2 * index + 1, input)
                }
            }
        }
        if (2 * index + 2 < input.size) {
            input[2 * index + 2].let {
                right = Node(it).also { node ->
                    node.insert(2 * index + 2, input)
                }
            }
        }
    }

    companion object {
        fun from(input: Array<Int>): Node? {
            if (input.isEmpty()) {
                return null
            }
            val first = input[0]
            val rootNode = Node(first)
            rootNode.insert(0, input)
            return rootNode
        }
    }
}
