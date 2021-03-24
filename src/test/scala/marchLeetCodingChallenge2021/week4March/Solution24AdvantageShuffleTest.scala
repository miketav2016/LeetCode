package marchLeetCodingChallenge2021.week4March

import marchLeetCodingChallenge2021.week4March.Solution24AdvantageShuffle.advantageCount
import org.scalatest.funsuite.AnyFunSuite

class Solution24AdvantageShuffleTest extends AnyFunSuite {

    test("testAdvantageCount0") {
        val A =Array(2,7,11,15)
        val B =Array(1,10,4,11)
        assert(advantageCount(A,B) === Array(2,11,7,15))
    }
    test("testAdvantageCount1") {
        val A =Array(12,24,8,32)
        val B =Array(13,25,32,11)
        assert(advantageCount(A,B) === Array(24,32,8,12))
    }
    test("testAdvantageCount2") {
        val A =Array(0)
        val B =Array(0)
        assert(advantageCount(A,B) === Array(0))
    }

}
