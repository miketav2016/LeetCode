package marchLeetCodingChallenge2021.week3March

import org.scalatest.funsuite.AnyFunSuite

class SolutionGenerateRandomPointInACircleTest extends AnyFunSuite {

  test("testRandPoint") {
    val obj = new SolutionGenerateRandomPointInACircle(10, 0, 0)
    val param_1 = obj.randPoint()
    assert(param_1(0) * param_1(0) + param_1(1) * param_1(1) <= 100)
  }

}
