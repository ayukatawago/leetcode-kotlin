package leetcode.problem0090

class Subsets2 {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val hashMap = HashMap<Int, Int>()

        nums.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }

        return getSubsets(hashMap).toList()
    }

    private fun getSubsets(hashMap: Map<Int, Int>): Set<List<Int>> {
        val answer = mutableSetOf<List<Int>>()
        val entry = hashMap.entries.first()

        createSet(entry.key, entry.value).forEach {
            if (hashMap.size == 1) {
                answer.add(it)
            } else {
                val clonedHashMap = hashMap.toMutableMap()
                clonedHashMap.remove(entry.key)
                val subSet = getSubsets(clonedHashMap)
                subSet.forEach { sub ->
                    answer.add(it + sub)
                }
            }
        }

        return answer
    }

    private fun createSet(key: Int, value: Int): Set<List<Int>> {
        val mutableList = mutableSetOf<List<Int>>()
        var count = 0
        while (count <= value) {
            mutableList.add(List(count) { key })
            count++
        }
        return mutableList
    }
}
