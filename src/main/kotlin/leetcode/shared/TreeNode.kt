package leetcode.shared

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    fun insert(index: Int, input: Array<Int?>) {
        if (2 * index + 1 < input.size) {
            input[2 * index + 1]?.let {
                left = TreeNode(it).also { node ->
                    node.insert(2 * index + 1, input)
                }
            }
        }
        if (2 * index + 2 < input.size) {
            input[2 * index + 2]?.let {
                right = TreeNode(it).also { node ->
                    node.insert(2 * index + 2, input)
                }
            }
        }
    }

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
        fun from(input: Array<Int?>): TreeNode? {
            if (input.isEmpty()) return null
            val first = input[0] ?: return null
            val rootNode = TreeNode(first)
            rootNode.insert(0, input)
            return rootNode
        }
    }
}
