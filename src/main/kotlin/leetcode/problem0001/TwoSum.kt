class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        val hashmap = HashMap<Int, Int>()

        nums.forEachIndexed { index, value ->
            val missing = target - value
            if (hashmap.containsKey(missing) && hashmap[missing] != index) {
                hashmap[missing]?.let {
                    return intArrayOf(it, index)
                }
            }
            hashmap[value]= index
        }
        return null
    }
}
