package leetcode.shared

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    fun toList(): List<Int?> {
        val array = arrayListOf<Int?>()

        retrieve(array, this, 0)

        return array.dropLastWhile { it == null }
    }

    private fun retrieve(array: ArrayList<Int?>, node: TreeNode?, index: Int) {
        while (index >= array.size) {
            array.add(null)
        }
        array[index] = node?.`val`

        if (node == null) return

        retrieve(array, node.left, 2 * index + 1)
        retrieve(array, node.right, 2 * index + 2)
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
