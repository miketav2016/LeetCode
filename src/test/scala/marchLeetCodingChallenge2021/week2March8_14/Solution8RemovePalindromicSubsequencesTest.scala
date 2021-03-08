package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.week2March8_14.Solution8RemovePalindromicSubsequences.removePalindromeSub
import org.scalatest.funsuite.AnyFunSuite

class Solution8RemovePalindromicSubsequencesTest extends AnyFunSuite {

  test("testRemovePalindromeSub0") {
    val s = "ababa"
    assert(removePalindromeSub(s) === 1)
  }
  test("testRemovePalindromeSub1") {
    val s = "abb"
    assert(removePalindromeSub(s) === 2)
  }
  test("testRemovePalindromeSub2") {
    val s = "baabb"
    assert(removePalindromeSub(s) === 2)
  }
  test("testRemovePalindromeSub3") {
    val s = ""
    assert(removePalindromeSub(s) === 0)
  }
  test("testRemovePalindromeSub4") {
    val s = "bbaabaaa"
    assert(removePalindromeSub(s) === 2)
  }
  test("testRemovePalindromeSub5") {
    val s = "bbaabaab"
    assert(removePalindromeSub(s) === 2)
  }
  "bbaabaaa"
}
