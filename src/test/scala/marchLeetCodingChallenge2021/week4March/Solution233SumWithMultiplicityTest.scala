package marchLeetCodingChallenge2021.week4March

import marchLeetCodingChallenge2021.week4March.Solution233SumWithMultiplicity.threeSumMulti
import org.scalatest.funsuite.AnyFunSuite

class Solution233SumWithMultiplicityTest extends AnyFunSuite {

    test("testThreeSumMulti0") {
        val arr = Array(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
        val target = 8
        assert(threeSumMulti(arr, target) == 20)
    }
    test("testThreeSumMulti1") {
        val arr = Array(1, 1, 2, 2, 2, 2)
        val target = 5
        assert(threeSumMulti(arr, target) == 12)
    }
    test("testThreeSumMulti2") {
        val arr = Array(0, 0, 0)
        val target = 0
        assert(threeSumMulti(arr, target) == 1)
    }

}
