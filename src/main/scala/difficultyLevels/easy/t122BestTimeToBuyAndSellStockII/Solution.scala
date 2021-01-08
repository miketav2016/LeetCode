package difficultyLevels.easy.t122BestTimeToBuyAndSellStockII

/**
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
object Solution extends App {

  def maxProfit(prices: Array[Int]): Int = {
    if (prices.length == 1)  0
    else {

    def check(int: Int) = {
      if (int < prices.length - 1)
        int + 1
      else
        int
    }
    prices.foldLeft((true, Int.MaxValue, 0, 1)) { case ((isCanBuy, price, profit, nextID), cur) =>
      if (isCanBuy && cur < prices(nextID)) {
        (false, cur, profit, check(nextID))
      } else if (price < cur && cur >= prices(nextID)) {
        (true, Int.MaxValue, profit + (cur - price), check(nextID))
      } else {
        (isCanBuy, price, profit, check(nextID))
      }
    }._3
    }
  }

  val prices0 = Array(7, 1, 5, 3, 6, 4) //7
  val prices1 = Array(1, 2, 3, 4, 5) //4
  val prices2 = Array(7, 6, 4, 3, 1) //0
  val prices3 = Array(1) //0
  val res = maxProfit(prices3)
  println(res)
}
