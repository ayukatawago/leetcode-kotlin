package leetcode.shared

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    fun toList(): List<Int?> {
        val result = mutableListOf<Int?>()
        val queue = ArrayDeque<TreeNode?>()
        queue.add(left)
        queue.add(right)
        result.add(`val`)
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            if (node == null) {
                result.add(null)
            } else {
                result.add(node.`val`)
                queue.add(node.left)
                queue.add(node.right)
            }
        }

        return result.dropLastWhile { it == null }
    }

    companion object {
        fun of(input: Array<Int?>): TreeNode? {
            if (input.isEmpty()) return null
            val firstValue = input[0] ?: return null
            val rootNode = TreeNode(firstValue)

            val queue = ArrayDeque<TreeNode>()
            queue.add(rootNode)
            var index = 1
            while (index < input.size) {
                val parent = queue.removeFirst()
                val leftValue = input[index++]
                if (leftValue != null) {
                    val leftNode = TreeNode(leftValue)
                    parent.left = leftNode
                    queue.add(leftNode)
                }
                if (index < input.size) {
                    val rightValue = input[index++]
                    if (rightValue != null) {
                        val rightNode = TreeNode(rightValue)
                        parent.right = rightNode
                        queue.add(rightNode)
                    }
                }
            }

            return rootNode
        }
    }
}
