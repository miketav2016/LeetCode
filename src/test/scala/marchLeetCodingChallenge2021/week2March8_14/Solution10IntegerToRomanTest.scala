package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.week2March8_14.Solution10IntegerToRoman.intToRoman
import org.scalatest.funsuite.AnyFunSuite

class Solution10IntegerToRomanTest extends AnyFunSuite {

  test("testIntToRoman3") {
    val s = "III"
    assert( intToRoman(3) === s)
  }
  test("testIntToRoman4") {
    val s = "IV"
    assert(intToRoman(4) === s)
  }
  test("testIntToRoman9") {
    val s = "IX"
    assert(intToRoman(9) === s)
  }
  test("testIntToRoman58") {
    val s = "LVIII"
    assert(intToRoman(58) === s)
  }
  test("testIntToRoman1994") {
    val s = "MCMXCIV"
    assert(intToRoman(1994) === s)
  }
  test("testIntToRoman3999") {
    val s = "MMMCMXCIX"
    assert(intToRoman(3999) === s)
  }
  test("testIntToRoman40") {
    val s = "XL"
    assert(intToRoman(40) === s)
  }
  test("testIntToRoman400") {
    val s = "CD"
    assert(intToRoman(400) === s)
  }

}
