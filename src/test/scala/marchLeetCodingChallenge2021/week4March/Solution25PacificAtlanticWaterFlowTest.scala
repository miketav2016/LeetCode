package marchLeetCodingChallenge2021.week4March

import marchLeetCodingChallenge2021.week4March.Solution25PacificAtlanticWaterFlow.pacificAtlantic
import org.scalatest.funsuite.AnyFunSuite

class Solution25PacificAtlanticWaterFlowTest extends AnyFunSuite {

    test("testPacificAtlantic0") {
        val matrix: Array[Array[Int]] = Array(
            Array(1, 2, 2, 3, 5),
            Array(3, 2, 3, 4, 4),
            Array(2, 4, 5, 3, 1),
            Array(6, 7, 1, 4, 5),
            Array(5, 1, 1, 2, 4)
        )
        val answer: List[List[Int]] = List(List(0, 4),
            List(1, 3),
            List(1, 4),
            List(2, 2),
            List(3, 0),
            List(3, 1),
            List(4, 0))
        assert(pacificAtlantic(matrix) === answer)
    }
    test("testPacificAtlantic1") {
        val matrix: Array[Array[Int]] = Array(
            Array(10, 10, 10),
            Array(10, 1, 10),
            Array(10, 10, 10)
        )
        val answer: List[List[Int]] = List(
            List(0, 0),
            List(0, 1),
            List(0, 2),
            List(1, 0),
            List(1, 2),
            List(2, 0),
            List(2, 1),
            List(2, 2)
        )
        assert(pacificAtlantic(matrix) === answer)
    }
    test("testPacificAtlantic2") {
        val matrix: Array[Array[Int]] = Array(
            Array(1, 2, 3),
            Array(8, 9, 4),
            Array(7, 6, 5)
        )
        val answer: List[List[Int]] = List(
            List(0, 2),
            List(1, 0),
            List(1, 1),
            List(1, 2),
            List(2, 0),
            List(2, 1),
            List(2, 2)
        )
        assert(pacificAtlantic(matrix) === answer)
    }

}
