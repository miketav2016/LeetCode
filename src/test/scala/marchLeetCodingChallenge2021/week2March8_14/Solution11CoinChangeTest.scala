package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.week2March8_14.Solution11CoinChange.coinChange
import org.scalatest.funsuite.AnyFunSuite

class Solution11CoinChangeTest extends AnyFunSuite {
  test("testCoinChange0") {
    assert(coinChange(Array(1, 2, 5), 11) === 3)
  }
  test("testCoinChange1") {
    assert(coinChange(Array(2), 3) === -1)
  }
  test("testCoinChange2") {
    assert(coinChange(Array(1), 0) === 0)
  }
  test("testCoinChange3") {
    assert(coinChange(Array(1), 1) === 1)
  }
  test("testCoinChange4") {
    assert(coinChange(Array(1), 2) === 2)
  }
  test("testCoinChange5") {
    assert(coinChange(Array(1, 2, 5, 13), 113) === 11)
  }
  test("testCoinChange6") {
    assert(coinChange(Array(470, 18, 66, 301, 403, 112, 360), 8235) === 20)
  }
  test("testCoinChange7") {
    assert(coinChange(Array(58, 92, 387, 421, 194, 208, 231), 7798) === 21)
  }
  test("testCoinChange8") {
    assert(coinChange(Array(429, 171, 485, 26, 381, 31, 290), 8440) === 20)
  }

}
