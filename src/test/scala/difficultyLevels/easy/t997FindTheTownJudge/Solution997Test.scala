package difficultyLevels.easy.t997FindTheTownJudge

import difficultyLevels.easy.t997FindTheTownJudge.Solution997.findJudge
import org.scalatest.funsuite.AnyFunSuite

class Solution997Test extends AnyFunSuite {

    test("testFindJudge0") {
        val n = 2
        val trust = Array(Array(1, 2))
        assert(findJudge(n, trust) == 2)
    }

    test("testFindJudge1") {
        val n = 3
        val trust = Array(Array(1, 3), Array(2, 3))
        assert(findJudge(n, trust) == 3)
    }
    test("testFindJudge2") {
        val n = 3
        val trust = Array(Array(1, 3), Array(2, 3), Array(3, 1))
        assert (findJudge(n, trust) == -1)
    }

    test("testFindJudge3") {
        val n = 3
        val trust = Array(Array(1, 2), Array(2, 3))
        assert(findJudge(n, trust) == -1)
    }
}
