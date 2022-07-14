package leetcode.problem0071

class SimplifyPath {
    fun simplifyPath(path: String): String {
        val queue = ArrayList<String>()
        path.split("/").forEach {
            when (it) {
                "", "." -> Unit
                ".." -> if (queue.isNotEmpty()) {
                    queue.removeAt(queue.lastIndex)
                }
                else -> queue.add(it)
            }
        }

        return "/" + queue.joinToString("/")
    }
}
