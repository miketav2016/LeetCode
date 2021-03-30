package marchLeetCodingChallenge2021.week5March

import marchLeetCodingChallenge2021.week5March.Solution30RussianDollEnvelopes.maxEnvelopes
import org.scalatest.funsuite.AnyFunSuite

class Solution30RussianDollEnvelopesTest extends AnyFunSuite {

    test("testMaxEnvelopes0") {
        val envelopes = Array(
            Array(5, 4),
            Array(6, 4),
            Array(6, 7),
            Array(2, 3)
        )
        assert(maxEnvelopes(envelopes) == 3)
    }
    test("testMaxEnvelopes1") {
        val envelopes = Array(
            Array(1, 1),
            Array(1, 1),
            Array(1, 1),
            Array(1, 1)
        )
        assert(maxEnvelopes(envelopes) == 1)
    }
    test("testMaxEnvelopes2") {
        val envelopes = Array(
            Array(7, 8),
            Array(12, 16),
            Array(12, 5),
            Array(1, 8),
            Array(4, 19),
            Array(3, 15),
            Array(4, 10),
            Array(9, 1)
        )
        assert(maxEnvelopes(envelopes) == 3)
    }

}
