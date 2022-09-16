package leetcode.problem0057

import kotlin.math.max
import kotlin.math.min

class InsertInterval {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val answer = arrayListOf<IntArray>()

        if (intervals.isEmpty()) {
            return arrayOf(newInterval)
        }

        intervals.forEachIndexed { index, ints ->
            when {
                ints[1] < newInterval[0] -> {
                    answer.add(ints)
                    if (index == intervals.lastIndex) {
                        answer.add(newInterval)
                    }
                }
                ints[0] > newInterval[1] -> {
                    if (answer.isEmpty() || answer.isNotEmpty() && answer.last()[1] < newInterval[0]) {
                        answer.add(newInterval)
                    }
                    answer.add(ints)
                }
                answer.isNotEmpty() && answer.last()[1] > newInterval[0] -> {
                    val last = answer.last()
                    answer[answer.lastIndex] =
                        intArrayOf(min(last[0], newInterval[0]), max(last[1], max(newInterval[1], ints[1])))
                }
                else -> {
                    answer.add(intArrayOf(min(ints[0], newInterval[0]), max(ints[1], newInterval[1])))
                }
            }
        }
        return answer.toTypedArray()
    }
}
