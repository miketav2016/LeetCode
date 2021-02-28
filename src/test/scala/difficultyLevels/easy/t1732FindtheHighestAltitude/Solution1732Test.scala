package difficultyLevels.easy.t1732FindtheHighestAltitude

import difficultyLevels.easy.t1732FindtheHighestAltitude.Solution1732.largestAltitude
import org.scalatest.funsuite.AnyFunSuite

class Solution1732Test extends AnyFunSuite {
  test("Test1") {
    val gain = Array(-5, 1, 5, 0, -7)
    assert(largestAltitude(gain) === 1)
  }
  test("Test2") {
    val gain = Array(-4, -3, -2, -1, 4, 3, 2)
    assert(largestAltitude(gain) === 0)
  }
}
