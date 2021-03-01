package marchLeetCodingChallenge2021.week1March1_7.distributeCandies

import marchLeetCodingChallenge2021.week1March1_7.distributeCandies.Solution1DistributeCandies.distributeCandies
import org.scalatest.funsuite.AnyFunSuite

class Solution1DistributeCandiesTest extends AnyFunSuite {
  test("Test1") {
    val candyType = Array(1, 1, 2, 2, 3, 3)
    assert(distributeCandies(candyType) === 3)
  }
  test("Test2") {
    val candyType = Array(1, 1, 2, 3)
    assert(distributeCandies(candyType) === 2)
  }
  test("Test3") {
    val candyType = Array(6, 6, 6, 6)
    assert(distributeCandies(candyType) === 1)
  }
}
