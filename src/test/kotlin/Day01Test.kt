import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day01Test {

    @Test
    fun testPart1Example() {
        val res = Day01().solutionPart1(Resources.resourceAsList("Day01_Example.txt"))
        assertEquals(24000, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day01().solutionPart1(Resources.resourceAsList("Day01.txt"))
        assertEquals(69912, res)
    }

    @Test
    fun testPart2Example() {
        val res = Day01().solutionPart2(Resources.resourceAsList("Day01_Example.txt"))
        assertEquals(45000, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day01().solutionPart2(Resources.resourceAsList("Day01.txt"))
        assertEquals(208180, res)
    }
}