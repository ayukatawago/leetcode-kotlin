package leetcode.problem0022

class GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        if (n == 1) {
            return listOf("()")
        }

        val mutableSet = mutableSetOf<String>()
        generateParenthesis(n - 1).forEach {
            mutableSet.add("($it)")
            mutableSet.add("$it()")
            mutableSet.add("()$it")
            getParenthesesSplitPairList(it).forEach { pair ->
                mutableSet.add("${pair.first}()()${pair.second}")
                mutableSet.add("${pair.first}(())${pair.second}")
            }
        }
        return mutableSet.toList()
    }

    private fun getParenthesesSplitPairList(string: String): List<Pair<String, String>> {
        val mutableList = mutableListOf<Pair<String, String>>()
        val split = string.split("()")
        if (split.size == 1) {
            return emptyList()
        }
        split.indices.forEach { index ->
            val before = split.subList(0, index + 1).joinToString("()")
            val after = if (index == split.lastIndex) {
                return@forEach
            } else {
                split.subList(index + 1, split.lastIndex + 1).joinToString("()")
            }
            mutableList.add(before to after)
        }
        return mutableList
    }
}
