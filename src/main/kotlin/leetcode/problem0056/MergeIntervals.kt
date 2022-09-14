package leetcode.problem0056

import kotlin.math.max
import kotlin.math.min

class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val answer = arrayListOf<IntArray>()

        intervals.sortBy { it[0] }
        intervals.forEach { interval ->
            if (answer.isNotEmpty() && answer[answer.lastIndex][1] >= interval[0]) {
                answer[answer.lastIndex] =
                    intArrayOf(min(answer.last()[0], interval[0]), max(answer.last()[1], interval[1]))
                return@forEach
            }
            answer.add(interval)
        }

        return answer.toTypedArray()
    }
}
