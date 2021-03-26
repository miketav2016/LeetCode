package marchLeetCodingChallenge2021.week4March

import marchLeetCodingChallenge2021.week4March.Solution26WordSubsets.wordSubsets
import org.scalatest.funsuite.AnyFunSuite

class Solution26WordSubsetsTest extends AnyFunSuite {

    test("testWordSubsets0") {
        val a = Array("amazon", "apple", "facebook", "google", "leetcode")
        val b = Array("e", "o")
        assert(wordSubsets(a, b) === Array("facebook", "google", "leetcode"))
    }
    test("testWordSubsets1") {
        val a = Array("amazon", "apple", "facebook", "google", "leetcode")
        val b = Array("l", "e")
        assert(wordSubsets(a, b) === Array("apple", "google", "leetcode"))
    }
    test("testWordSubsets2") {
        val a = Array("amazon", "apple", "facebook", "google", "leetcode")
        val b = Array("e", "oo")
        assert(wordSubsets(a, b) === Array("facebook", "google"))
    }
    test("testWordSubsets3") {
        val a = Array("amazon", "apple", "facebook", "google", "leetcode")
        val b = Array("lo", "eo")
        assert(wordSubsets(a, b) === Array("google", "leetcode"))
    }
    test("testWordSubsets4") {
        val a = Array("amazon", "apple", "facebook", "google", "leetcode")
        val b = Array("ec", "oc", "ceo")
        assert(wordSubsets(a, b) === Array("facebook", "leetcode"))
    }

}
