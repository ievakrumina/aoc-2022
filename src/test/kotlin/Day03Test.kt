import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day03Test {
    @Test
    fun testPart1Example() {
        val res = Day03().solutionPart1(Resources.resourceAsList("Day03_Example.txt"))
        assertEquals(157, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day03().solutionPart1(Resources.resourceAsList("Day03.txt"))
        assertEquals(7428, res)
    }

    @Test
    fun testPart2Example() {
        val res = Day03().solutionPart2(Resources.resourceAsList("Day03_Example.txt"))
        assertEquals(70, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day03().solutionPart2(Resources.resourceAsList("Day03.txt"))
        assertEquals(2650, res)
    }
}