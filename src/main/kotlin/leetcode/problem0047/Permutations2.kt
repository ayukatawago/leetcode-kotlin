package leetcode.problem0047

class Permutations2 {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val hashMap = hashMapOf<Int, Int>()
        nums.forEach {
            hashMap[it] = if (hashMap.containsKey(it)) {
                requireNotNull(hashMap[it]) + 1
            } else {
                1
            }
        }

        return permute(hashMap)
    }

    private fun permute(hashMap: HashMap<Int, Int>): List<List<Int>> =
        if (hashMap.values.filter { it > 0 }.size == 1) {
            val tmp = hashMap.filterValues { it > 0 }
            listOf(IntArray(tmp.values.first()) { tmp.keys.first() }.toList())
        } else {
            hashMap.flatMap { (key, value) ->
                if (value == 0) {
                    return@flatMap emptyList<List<Int>>()
                }
                hashMap[key] = value - 1
                try {
                    permute(hashMap).map {
                        val tmpList = mutableListOf<Int>()
                        tmpList.add(key)
                        tmpList.addAll(it)
                        tmpList
                    }
                } finally {
                    hashMap[key] = value
                }
            }
        }
}
