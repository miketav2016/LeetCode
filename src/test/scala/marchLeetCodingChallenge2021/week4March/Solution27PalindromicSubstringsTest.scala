package marchLeetCodingChallenge2021.week4March

import marchLeetCodingChallenge2021.week4March.Solution27PalindromicSubstrings.countSubstrings
import org.scalatest.funsuite.AnyFunSuite

class Solution27PalindromicSubstringsTest extends AnyFunSuite {

    test("testCountSubstrings0") {
        val string = "abc"
        assert(countSubstrings(string) == 3)
    }

    test("testCountSubstrings1") {
        val string = "aaa"
        assert(countSubstrings(string) == 6)
    }

    test("testCountSubstrings2") {
        val string = "abc"
        assert(countSubstrings(string) == 3)
    }

}
