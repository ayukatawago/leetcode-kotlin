package leetcode.problem0017

class LetterCombinationsOfPhoneNumber {
    fun letterCombinations(digits: String): List<String> {
        var answer = mutableListOf<String>()

        digits.forEach { digit ->
            val letters = PHONE_STRING_MAP[digit] ?: return@forEach
            if (answer.isEmpty()) {
                answer = letters.toMutableList()
            } else {
                val currentAnswer = answer.toList()
                answer = mutableListOf()
                letters.forEach { letter ->
                    currentAnswer.forEach {
                        answer.add(it + letter)
                    }
                }
            }
            println(answer)
        }

        return answer.sorted()
    }

    companion object {
        private val PHONE_STRING_MAP: Map<Char, List<String>> =
            mapOf(
                '2' to listOf("a", "b", "c"),
                '3' to listOf("d", "e", "f"),
                '4' to listOf("g", "h", "i"),
                '5' to listOf("j", "k", "l"),
                '6' to listOf("m", "n", "o"),
                '7' to listOf("p", "q", "r", "s"),
                '8' to listOf("t", "u", "v"),
                '9' to listOf("w", "x", "y", "z")
            )
    }
}
