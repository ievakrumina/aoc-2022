class Day01 {

    private fun transformInput(input: List<String>): List<Int> {
        return input.foldIndexed(mutableListOf<Int>()) { index, acc, s ->
            if (index == 0 || s == "") {
               acc.add(0)
            }
            if (s != "") acc[acc.lastIndex] += s.toInt()
            acc
        }
    }

    fun solutionPart1(input: List<String>): Int? {
        return transformInput(input).maxOrNull()
    }

    fun solutionPart2(input: List<String>): Int? {
        return transformInput(input).sortedDescending().take(3).sum()
    }
}