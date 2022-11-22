package leetcode.problem0102

import leetcode.shared.TreeNode

class BinaryTreeLevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val arrayList = arrayListOf<ArrayList<Int>>()

        storeNode(root, arrayList, 0)

        return arrayList
    }

    private fun storeNode(root: TreeNode?, arrayList: ArrayList<ArrayList<Int>>, layer: Int) {
        if (root == null) return

        if (arrayList.lastIndex < layer) {
            arrayList.add(arrayListOf(root.`val`))
        } else {
            arrayList[layer].add(root.`val`)
        }

        storeNode(root.left, arrayList, layer + 1)
        storeNode(root.right, arrayList, layer + 1)
    }
}
