package leetcode.problem0103

import leetcode.shared.TreeNode
import java.util.LinkedList

class BinaryTreeZigzagLevelOrderTraversal {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val arrayList = arrayListOf<LinkedList<Int>>()

        storeNode(root, arrayList, 0)

        return arrayList
    }

    private fun storeNode(root: TreeNode?, arrayList: ArrayList<LinkedList<Int>>, layer: Int) {
        if (root == null) return

        if (arrayList.lastIndex < layer) {
            arrayList.add(LinkedList<Int>().apply { add(root.`val`) })
        } else {
            if (layer % 2 == 0) {
                arrayList[layer].add(root.`val`)
            } else {
                arrayList[layer].addFirst(root.`val`)
            }
        }

        storeNode(root.left, arrayList, layer + 1)
        storeNode(root.right, arrayList, layer + 1)
    }
}
