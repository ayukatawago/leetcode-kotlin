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
