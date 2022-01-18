package difficultyLevels.easy.t290WordPattern

import difficultyLevels.easy.t290WordPattern.Solution290.wordPattern
import org.scalatest.funsuite.AnyFunSuite

class Solution290Test extends AnyFunSuite {

    test("testWordPattern0") {
        val pattern = "abba"
        val s = "dog cat cat dog"
        assert(wordPattern(pattern, s))
    }

    test("testWordPattern1") {
        val pattern = "abba"
        val s = "dog cat cat fish"
        assert(!wordPattern(pattern, s))
    }

    test("testWordPattern2") {
        val pattern = "aaaa"
        val s = "dog cat cat dog"
        assert(!wordPattern(pattern, s))
    }

    test("testWordPattern3") {
        val pattern = "abba"
        val s = "dog dog dog dog"
        assert(!wordPattern(pattern, s))
    }

    test("testWordPattern4") {
        val pattern = "aaa"
        val s = "aa aa aa aa"
        assert(!wordPattern(pattern, s))
    }

}
