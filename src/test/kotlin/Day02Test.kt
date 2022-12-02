import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day02Test {
    @Test
    fun testPart1Example() {
        val res = Day02().solutionPart1(Resources.resourceAsList("Day02_Example.txt"))
        assertEquals(15, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day02().solutionPart1(Resources.resourceAsList("Day02.txt"))
        assertEquals(12276,res)
    }

    @Test
    fun testPart2Example() {
        val res = Day02().solutionPart2(Resources.resourceAsList("Day02_Example.txt"))
        assertEquals(12, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day02().solutionPart2(Resources.resourceAsList("Day02.txt"))
        assertEquals(9975, res)
    }
}