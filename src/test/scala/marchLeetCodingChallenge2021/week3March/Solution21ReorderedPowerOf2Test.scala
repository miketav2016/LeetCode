package marchLeetCodingChallenge2021.week3March

import marchLeetCodingChallenge2021.week3March.Solution21ReorderedPowerOf2.reorderedPowerOf2
import org.scalatest.funsuite.AnyFunSuite

class Solution21ReorderedPowerOf2Test extends AnyFunSuite {

  test("testReorderedPowerOf2#0") {
    assert(reorderedPowerOf2(1))
  }
  test("testReorderedPowerOf2#1") {
    assert(reorderedPowerOf2(2))
  }
  test("testReorderedPowerOf2#2") {
    assert(!reorderedPowerOf2(10))
  }
  test("testReorderedPowerOf2#3") {
    assert(reorderedPowerOf2(16))
  }
  test("testReorderedPowerOf2#4") {
    assert(!reorderedPowerOf2(24))
  }
  test("testReorderedPowerOf2#5") {
    assert(reorderedPowerOf2(46))
  }

}
