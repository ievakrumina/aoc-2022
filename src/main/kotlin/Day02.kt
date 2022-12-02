class Day02 {

    fun solutionPart1(input: List<String>): Int {
        var score = 0
        input.forEach {
            val res = it.trim().split(" ")
            when (res[0]) {
                "A" -> {
                    when (res[1]) {
                        "X" -> score += 1 + 3
                        "Y" -> score += 2 + 6
                        "Z" -> score += 3 + 0
                    }
                }
                "B" -> {
                    when (res[1]) {
                        "X" -> score += 1 + 0
                        "Y" -> score += 2 + 3
                        "Z" -> score += 3 + 6
                    }
                }
                "C" -> {
                    when (res[1]) {
                        "X" -> score += 1 + 6
                        "Y" -> score += 2 + 0
                        "Z" -> score += 3 + 3
                    }
                }
            }
        }
        return score
    }

    fun solutionPart2(input: List<String>): Int {
        var score = 0
        input.forEach {
            val res = it.trim().split(" ")
            when (res[0]) {
                "A" -> {
                    when (res[1]) {
                        "X" -> score += 0 + 3
                        "Y" -> score += 3 + 1
                        "Z" -> score += 6 + 2
                    }
                }
                "B" -> {
                    when (res[1]) {
                        "X" -> score += 0 + 1
                        "Y" -> score += 3 + 2
                        "Z" -> score += 6 + 3
                    }
                }
                "C" -> {
                    when (res[1]) {
                        "X" -> score += 0 + 2

                        "Y" -> score += 3 + 3
                        "Z" -> score += 6 + 1
                    }
                }
            }
        }
        return score
    }
}