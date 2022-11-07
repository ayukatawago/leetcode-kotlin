package leetcode.problem0095

import leetcode.shared.TreeNode

class UniqueBinarySearchTrees2 {
    fun generateTrees(n: Int): List<TreeNode?> {
        if (n == 1) {
            return listOf(TreeNode(1))
        }

        val dpMap = hashMapOf<Pair<Int, Int>, List<TreeNode?>>()
        return findNodeList(1, n, dpMap)
    }

    private fun findNodeList(left: Int, right: Int, dpMap: HashMap<Pair<Int, Int>, List<TreeNode?>>): List<TreeNode?> =
        when {
            left > right -> listOf(null)
            left == right -> listOf(TreeNode(left))
            left to right in dpMap.keys -> dpMap[left to right].orEmpty()
            else -> {
                val nodeList = mutableListOf<TreeNode?>()
                (left..right).forEach { index ->
                    val leftTree = findNodeList(left, index - 1, dpMap)
                    val rightTree = findNodeList(index + 1, right, dpMap)
                    leftTree.forEach { lt ->
                        rightTree.forEach { rt ->
                            val node = TreeNode(index).apply {
                                this.left = lt
                                this.right = rt
                            }
                            nodeList.add(node)
                        }
                    }
                }
                nodeList.also {
                    dpMap[left to right] = it
                }
            }
        }
}
