import kotlin.math.sign

class Day09 {

    fun solutionPart1(input: List<String>): Int {
        val positionTailVisited = mutableSetOf(Pair(0, 0))
        var headPosition = Pair(0, 0)
        var tailPosition = Pair(0, 0)

        input.forEach { move ->
            val pos = move.substringAfter(" ").toInt()
            val moveDirection = when {
                move.startsWith("L") -> Pair(-1,0)
                move.startsWith("R") -> Pair(1,0)
                move.startsWith("D") -> Pair(0,-1)
                move.startsWith("U") -> Pair(0,1)
                else -> {
                    println("Invalid move: $move")
                    Pair(0,0)
                }
            }
            repeat(pos) {
                headPosition = headPosition.headMovement(moveDirection.first, moveDirection.second)
                tailPosition = tailPosition.tailMovement(headPosition)
                positionTailVisited.add(tailPosition)
            }

        }
        return positionTailVisited.size
    }

    fun solutionPart2(input: List<String>): Int {
        val positionTailVisited = mutableSetOf(Pair(0, 0))
        val ropeOfKnots = mutableListOf(
            Pair(0,0),
            Pair(0,0),
            Pair(0,0),
            Pair(0,0),
            Pair(0,0),
            Pair(0,0),
            Pair(0,0),
            Pair(0,0),
            Pair(0,0),
            Pair(0,0)
        )
        input.forEach { move ->
            val pos = move.substringAfter(" ").toInt()
            val moveDirection = when {
                move.startsWith("L") -> Pair(-1,0)
                move.startsWith("R") -> Pair(1,0)
                move.startsWith("D") -> Pair(0,-1)
                move.startsWith("U") -> Pair(0,1)
                else -> {
                    println("Invalid move: $move")
                    Pair(0,0)
                }
            }
            repeat(pos) {
                ropeOfKnots[0] = ropeOfKnots[0].headMovement(moveDirection.first, moveDirection.second)
                (1 until ropeOfKnots.size).forEach { index ->
                    ropeOfKnots[index] = ropeOfKnots[index].tailMovement(ropeOfKnots[index-1])
                }
                positionTailVisited.add(ropeOfKnots[9])
            }

        }
        return positionTailVisited.size
    }

    companion object {
        fun Pair<Int, Int>.headMovement(x: Int, y: Int): Pair<Int, Int> {
            return Pair(this.first + x, this.second + y)
        }

        fun Pair<Int, Int>.tailMovement(head: Pair<Int, Int>): Pair<Int, Int> {
            val distanceBetween = Pair(head.first - this.first, head.second - this.second)
            return when {
                (distanceBetween.first <= 1 && distanceBetween.first >= -1 &&
                        distanceBetween.second <= 1 && distanceBetween.second >= -1) -> this
                distanceBetween.second == 0 -> Pair(this.first + distanceBetween.first.sign, this.second)
                distanceBetween.first == 0 -> Pair(this.first, this.second + distanceBetween.second.sign)
                else -> Pair(this.first + distanceBetween.first.sign, this.second + distanceBetween.second.sign)
            }
        }
    }
}