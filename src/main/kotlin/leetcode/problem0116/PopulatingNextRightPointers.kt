package leetcode.problem0116

import leetcode.shared.Node

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
