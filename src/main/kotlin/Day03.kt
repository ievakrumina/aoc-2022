class Day03 {

    fun solutionPart1(input: List<String>): Int {
        var res = 0
        input.forEach { str ->
            res += str.substring(0 until str.length / 2)
                .first { str.substring(str.length / 2 until str.length).contains(it) }
                .getItemAmount()
        }
        return res
    }

    fun solutionPart2(input: List<String>): Int {
        var res = 0
        for (i in input.indices step 3) {
            res += input[i]
                .first { input[i + 1].contains(it) && input[i + 2].contains(it) }
                .getItemAmount()
        }

        return res
    }

    private fun Char.getItemAmount(): Int = if (this.code > 96) {
        this.code - 96
    } else {
        this.code - 65 + 27
    }
}