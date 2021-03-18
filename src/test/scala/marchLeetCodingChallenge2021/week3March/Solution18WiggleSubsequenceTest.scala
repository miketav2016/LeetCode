package marchLeetCodingChallenge2021.week3March

import marchLeetCodingChallenge2021.week3March.Solution18WiggleSubsequence.wiggleMaxLength
import org.scalatest.funsuite.AnyFunSuite

class Solution18WiggleSubsequenceTest extends AnyFunSuite {

  test("testWiggleMaxLength0") {
    val nums = Array(1, 7, 4, 9, 2, 5)
    assert(wiggleMaxLength(nums) === 6)
  }
  test("testWiggleMaxLength1") {
    val nums = Array(1, 17, 5, 10, 13, 15, 10, 5, 16, 8)
    assert(wiggleMaxLength(nums) === 7)
  }
  test("testWiggleMaxLength2") {
    val nums = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    assert(wiggleMaxLength(nums) === 2)
  }
  test("testWiggleMaxLength3") {
    val nums = Array(0, 0, 0)
    assert(wiggleMaxLength(nums) === 1)
  }
  test("testWiggleMaxLength4") {
    val nums = Array(0, 0)
    assert(wiggleMaxLength(nums) === 1)
  }
  test("testWiggleMaxLength5") {
    val nums = Array(3,3,3,2,5)
    assert(wiggleMaxLength(nums) === 3)
  }
}
