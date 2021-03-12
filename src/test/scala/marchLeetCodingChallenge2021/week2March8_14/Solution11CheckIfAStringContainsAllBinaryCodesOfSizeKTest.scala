package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.week2March8_14.Solution11CheckIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes
import org.scalatest.funsuite.AnyFunSuite

class Solution11CheckIfAStringContainsAllBinaryCodesOfSizeKTest extends AnyFunSuite {

  test("testHasAllCodes1") {
    assert(hasAllCodes("00110110", 2) === true)
  }

  test("testHasAllCodes2") {
    assert(hasAllCodes("00110", 2) === true)
  }
  test("testHasAllCodes3") {
    assert(hasAllCodes("0110", 1) === true)
  }
  test("testHasAllCode4") {
    assert(hasAllCodes("0110", 2) === false)
  }
  test("testHasAllCodes5") {
    assert(hasAllCodes("0000000001011100", 4) === false)
  }

}
