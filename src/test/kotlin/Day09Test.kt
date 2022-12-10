import Day09.Companion.headMovement
import Day09.Companion.tailMovement
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals


internal class Day09Test {

    @ParameterizedTest
    @MethodSource("headPosition")
    fun testHeadMovement(x: Int, y: Int, pos: Pair<Int, Int>) {
        val startingPoint = Pair(0,0)
        assertEquals(pos, startingPoint.headMovement(x,y))
    }

    @ParameterizedTest
    @MethodSource("tailPosition")
    fun testTailMovement(headPos: Pair<Int,Int>, expectedTailPos: Pair<Int, Int>) {
        val startingPoint = Pair(0,0)
        assertEquals(expectedTailPos, startingPoint.tailMovement(headPos))
    }

    @Test
    fun testPart1Example() {
        val res = Day09().solutionPart1(Resources.resourceAsList("Day09_Example.txt"))
        assertEquals(13, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day09().solutionPart1(Resources.resourceAsList("Day09.txt"))
        assertEquals(6018, res)
    }

    @Test
    fun testPart2Example() {
        val res = Day09().solutionPart2(Resources.resourceAsList("Day09_Example.txt"))
        assertEquals(1, res)
    }

    @Test
    fun testPart2Example2() {
        val res = Day09().solutionPart2(Resources.resourceAsList("Day09_Example2.txt"))
        assertEquals(36, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day09().solutionPart2(Resources.resourceAsList("Day09.txt"))
        assertEquals(2619, res)
    }

    companion object {
        @JvmStatic
        fun headPosition() = listOf(
            Arguments.of(1,0,Pair(1,0)),
            Arguments.of(-1,0,Pair(-1,0)),
            Arguments.of(0,1,Pair(0,1)),
            Arguments.of(0,-1,Pair(0,-1)),
        )

        @JvmStatic
        fun tailPosition() = listOf(
            // Not moving
            Arguments.of(Pair(0,0), Pair(0,0)),
            Arguments.of(Pair(1,0), Pair(0,0)),
            Arguments.of(Pair(1,1), Pair(0,0)),
            Arguments.of(Pair(0,1), Pair(0,0)),
            Arguments.of(Pair(-1,1), Pair(0,0)),
            Arguments.of(Pair(-1,0), Pair(0,0)),
            Arguments.of(Pair(-1,-1), Pair(0,0)),
            Arguments.of(Pair(0,-1), Pair(0,0)),
            // Moving
            Arguments.of(Pair(2,0),Pair(1,0)),
            Arguments.of(Pair(-2,0), Pair(-1,0)),
            Arguments.of(Pair(0,2), Pair(0, 1)),
            Arguments.of(Pair(0,-2), Pair(0, -1)),
            Arguments.of(Pair(1,2), Pair(1, 1)),
            Arguments.of(Pair(2,1), Pair(1, 1)),
            Arguments.of(Pair(1,-2), Pair(1, -1)),
            Arguments.of(Pair(2,-1), Pair(1, -1)),
            Arguments.of(Pair(-1,2), Pair(-1, 1)),
            Arguments.of(Pair(-2,1), Pair(-1, 1)),
            Arguments.of(Pair(-1,-2), Pair(-1, -1)),
            Arguments.of(Pair(-2, -1), Pair(-1, -1))
        )
    }
}