package difficultyLevels.hard.t315CountOfSmallerNumbersAfterSelf

import difficultyLevels.hard.t315CountOfSmallerNumbersAfterSelf.Solution.countSmaller
import org.scalatest.funsuite.AnyFunSuite

class SolutionTest extends AnyFunSuite {
  test("Test1") {
    val nums = Array(5, 2, 6, 1)
    assert(countSmaller(nums) === Array(2, 1, 1, 0))
  }

  test("Test2") {
    val nums = Array(-1)
    assert(countSmaller(nums) === Array(0))
  }

  test("Test3") {
    val nums = Array(-1, -1)
    assert(countSmaller(nums) === Array(0,0))
  }
}
