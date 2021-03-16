package marchLeetCodingChallenge2021.week3March

object Solution16BestTimeToBuyAndSellStockWithTransactionFee {
  def maxProfit0(prices: Array[Int], fee: Int): Int = {
    if (prices.length == 1)
      0
    else {
      val maxPrice = 5e4.toInt
      val pricesZ = prices :+ 0
      prices.foldLeft((0, maxPrice, true, 0)) { case ((profit, purchasePrice, canBuy, id), currentPrice) =>
        currentPrice match {
          case _ if canBuy && pricesZ(id + 1) > currentPrice => (profit, currentPrice, false, id + 1)
          case _ if purchasePrice < currentPrice => (profit + currentPrice - fee, maxPrice, true, id + 1)
          case _ => (profit, purchasePrice, canBuy, id + 1)
        }
      }._1
    }
  }

  def maxProfit(prices: Array[Int], fee: Int): Int = {
    prices.foldLeft((0, -prices.head)) { case ((cash, hold), cur) =>
      val cashNew = Math.max(cash, hold + cur - fee)
      val holdNew = Math.max(hold, cashNew - cur)
      (cashNew, holdNew)
    }._1
  }
}
