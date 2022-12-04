import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day04Test {
    @Test
    fun testPart1Example() {
        val res = Day04().solutionPart1(Resources.resourceAsList("Day04_Example.txt"))
        assertEquals(2, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day04().solutionPart1(Resources.resourceAsList("Day04.txt"))
        assertEquals(431, res)
    }

    @Test
    fun testPart2Example() {
        val res = Day04().solutionPart2(Resources.resourceAsList("Day04_Example.txt"))
        assertEquals(4, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day04().solutionPart2(Resources.resourceAsList("Day04.txt"))
        assertEquals(823, res)
    }
}