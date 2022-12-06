import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day06Test {
    @Test
    fun testPart1Example() {
        val input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
        val res = Day06().solutionPart1(input)
        assertEquals(7, res)
    }

    @Test
    fun testPart1Example2() {
        val input = "bvwbjplbgvbhsrlpgdmjqwftvncz"
        val res = Day06().solutionPart1(input)
        assertEquals(5, res)
    }
    @Test
    fun testPart1Example3() {
        val input = "nppdvjthqldpwncqszvftbrmjlhg"
        val res = Day06().solutionPart1(input)
        assertEquals(6, res)
    }
    @Test
    fun testPart1Example4() {
        val input = "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"
        val res = Day06().solutionPart1(input)
        assertEquals(10, res)
    }
    @Test
    fun testPart1Example5() {
        val input = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"
        val res = Day06().solutionPart1(input)
        assertEquals(11, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day06().solutionPart1(Resources.resourceAsString("Day06.txt"))
        assertEquals(1909, res)
    }

    @Test
    fun testPart2Example() {
        val input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
        val res = Day06().solutionPart2(input)
        assertEquals(19, res)
    }

    @Test
    fun testPart2Exampl1() {
        val input = "bvwbjplbgvbhsrlpgdmjqwftvncz"
        val res = Day06().solutionPart2(input)
        assertEquals(23, res)
    }

    @Test
    fun testPart2Example3() {
        val input = "nppdvjthqldpwncqszvftbrmjlhg"
        val res = Day06().solutionPart2(input)
        assertEquals(23, res)
    }

    @Test
    fun testPart2Example4() {
        val input = "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"
        val res = Day06().solutionPart2(input)
        assertEquals(29, res)
    }

    @Test
    fun testPart2Example5() {
        val input = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"
        val res = Day06().solutionPart2(input)
        assertEquals(26, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day06().solutionPart2(Resources.resourceAsString("Day06.txt"))
        assertEquals(3380, res)
    }
}