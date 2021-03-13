package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.week2March8_14.Solution13BinaryTreesWithFactors.numFactoredBinaryTrees
import org.scalatest.funsuite.AnyFunSuite

class Solution13BinaryTreesWithFactorsTest extends AnyFunSuite {

  test("testNumFactoredBinaryTrees0") {
    assert(numFactoredBinaryTrees(Array(2, 4)) === 3)
  }
  test("testNumFactoredBinaryTrees1") {
    assert(numFactoredBinaryTrees(Array(2, 4, 5, 10)) === 7)
  }
  test("testNumFactoredBinaryTrees9999") {
    assert(numFactoredBinaryTrees(Array(2, 7, 5, 9)) === 4)
  }
  test("testNumFactoredBinaryTrees2") {
    assert(numFactoredBinaryTrees(Array(2, 4, 16)) === 8)
  }
  test("testNumFactoredBinaryTrees3") {
    assert(numFactoredBinaryTrees(Array(2, 4, 16, 256)) === 34)
  }

}
