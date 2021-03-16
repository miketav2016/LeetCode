package marchLeetCodingChallenge2021.week3March

import marchLeetCodingChallenge2021.week3March.Solution16BestTimeToBuyAndSellStockWithTransactionFee.maxProfit
import org.scalatest.funsuite.AnyFunSuite

class Solution16BestTimeToBuyAndSellStockWithTransactionFeeTest extends AnyFunSuite {

  test("testMaxProfit0") {
    val prices = Array(1, 3, 7, 5, 10, 3)
    val fee = 3
    assert(maxProfit(prices, fee) === 6)
  }
  test("testMaxProfit2") {
    val prices = Array(1, 3, 2, 8, 4, 9)
    val fee = 2
    assert(maxProfit(prices, fee) === 8)
  }
  test("testMaxProfit3") {
    val prices = Array(7, 1, 5, 3, 6, 4)
    val fee = 0
    assert(maxProfit(prices, fee) === 7)
  }
  test("testMaxProfit4") {
    val prices = Array(4, 5, 5, 2, 4, 3, 5, 5, 2, 3)
    val fee = 3
    assert(maxProfit(prices, fee) === 0)
  }
  test("testMaxProfit5") {
    val prices = Array(4, 5, 2, 4, 3, 3, 1, 2, 5, 4)
    val fee = 1
    assert(maxProfit(prices, fee) === 4)
  }

}
