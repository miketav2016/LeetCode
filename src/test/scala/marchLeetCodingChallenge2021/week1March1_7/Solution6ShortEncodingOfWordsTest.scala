package marchLeetCodingChallenge2021.week1March1_7

import marchLeetCodingChallenge2021.week1March1_7.Solution6ShortEncodingOfWords.minimumLengthEncoding
import org.scalatest.funsuite.AnyFunSuite

class Solution6ShortEncodingOfWordsTest extends AnyFunSuite {

  test("testMinimumLengthEncoding1") {
    val words = Array("time", "me", "bell")
    val res = minimumLengthEncoding(words)
    assert(res === 10)
  }
  test("testMinimumLengthEncoding2") {
    val words = Array("feipyxx", "e")
    val res = minimumLengthEncoding(words)
    assert(res === 10)
  }

}
