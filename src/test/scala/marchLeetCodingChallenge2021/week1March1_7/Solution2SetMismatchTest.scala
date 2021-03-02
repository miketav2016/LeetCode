package marchLeetCodingChallenge2021.week1March1_7

import marchLeetCodingChallenge2021.week1March1_7.Solution2SetMismatch.findErrorNums
import org.scalatest.funsuite.AnyFunSuite

class Solution2SetMismatchTest extends AnyFunSuite {
  test("Test1") {
    val nums = Array(1, 2, 2, 4)
    assert(findErrorNums(nums) === Array(2, 3))
  }
  test("Test2") {
    val nums = Array(1, 1)
    assert(findErrorNums(nums) === Array(1, 2))
  }
  test("Test3") {
    val nums = Array(2, 2)
    assert(findErrorNums(nums) === Array(2, 1))
  }
  test("Test4") {
    val nums = Array(3, 2, 2)
    assert(findErrorNums(nums) === Array(2, 1))
  }
  test("Test5") {
    val nums = Array(3, 2, 3, 4, 6, 5)
    assert(findErrorNums(nums) === Array(3, 1))
  }
}
