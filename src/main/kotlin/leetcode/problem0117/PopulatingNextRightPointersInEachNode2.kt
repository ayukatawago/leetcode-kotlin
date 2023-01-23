package leetcode.problem0117

import leetcode.shared.Node

class PopulatingNextRightPointersInEachNode2 {
    fun connect(root: Node?): Node? {
        if (root == null) {
            return null
        }

        val queue = ArrayDeque<Node>()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val queueSize = queue.size
            var previousNode: Node? = null

            repeat(queueSize) {
                val node = queue.removeFirst()
                if (previousNode != null) {
                    previousNode!!.next = node
                }
                node.left?.let {
                    queue.add(it)
                }
                node.right?.let {
                    queue.add(it)
                }
                previousNode = node
            }
        }

        return root
    }
}
