package difficultyLevels.easy.t1614MaximumNestingDepthOfTheParentheses

import difficultyLevels.easy.t1614MaximumNestingDepthOfTheParentheses.Solution1614.maxDepth
import org.scalatest.funsuite.AnyFunSuite

class Solution1614Test extends AnyFunSuite {

  test("Test1") {
    val s = "(1+(2*3)+((8)/4))+1"
    assert(maxDepth(s) === 3)
  }

  test("Test2") {
    val s = "(1)+((2))+(((3)))"
    assert(maxDepth(s) === 3)
  }

  test("Test3") {
    val s = "1+(2*3)/(2-1)"
    assert(maxDepth(s) === 1)
  }

  test("Test4") {
    val s = "1"
    assert(maxDepth(s) === 0)
  }

}
