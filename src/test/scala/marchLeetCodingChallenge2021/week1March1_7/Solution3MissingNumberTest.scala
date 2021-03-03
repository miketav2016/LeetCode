package marchLeetCodingChallenge2021.week1March1_7

import marchLeetCodingChallenge2021.week1March1_7.Solution3MissingNumber.missingNumber
import org.scalatest.funsuite.AnyFunSuite

class Solution3MissingNumberTest extends AnyFunSuite {

  test("testMissingNumber0") {
    val nums = Array(3, 0, 1)
    assert(missingNumber(nums) === 2)
  }
  test("testMissingNumber1") {
    val nums = Array(0, 1)
    assert(missingNumber(nums) === 2)
  }
  test("testMissingNumber2") {
    val nums = Array(9, 6, 4, 2, 3, 5, 7, 0, 1)
    assert(missingNumber(nums) === 8)
  }
  test("testMissingNumber3") {
    val nums = Array(0)
    assert(missingNumber(nums) === 1)
  }
}
