package difficultyLevels.easy.t121BestTimeToBuyAndSellStock

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 */
object Solution extends App {
  def maxProfit(prices: Array[Int]): Int = {
    if (prices.isEmpty) 0
    else
      prices.tail.foldLeft((prices.head, 0)) { case ((buyP, prof), cur) =>
        cur match {
          case _ if buyP > cur => (cur, prof)
          case _ if (cur - buyP) > prof => (buyP, cur - buyP)
          case _ => (buyP, prof)
        }
      }._2
  }

  val array0 = Array(7, 1, 5, 3, 6, 4)
  val array1 = Array(7, 6, 4, 3, 1)
  val res = maxProfit(array0)
  println(res)
}
