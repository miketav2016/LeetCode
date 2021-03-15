package marchLeetCodingChallenge2021.week3March

import org.scalatest.funsuite.AnyFunSuite

class SolutionEncodeAndDecodeTinyURLTest extends AnyFunSuite {

  test("testDecode") {
    val longURL = "https://leetcode.com/problems/design-tinyurl"
    var obj = new SolutionEncodeAndDecodeTinyURL()
    val s = obj.encode(longURL)
    val ans = obj.decode(s)
    assert( longURL === ans)
  }

}
