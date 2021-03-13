package marchLeetCodingChallenge2021.week2March8_14

object Solution12CoinChange {
  def coinChange0(coins: Array[Int], amount: Int): Int = {
    val setRes = scala.collection.mutable.Set[Int]()

    def changeCounts(coins: Array[Int], amount: Int, acc: Int = 0): Unit = {
      amount match {
        case _ if amount == 0 =>
          setRes += acc
        case _ if amount > 0 && coins.nonEmpty =>
          changeCounts(coins, amount - coins.head, acc + 1)
          changeCounts(coins.tail, amount, acc)
        case _ => ()
      }
    }

    if (amount == 0)
      0
    else {
      changeCounts(coins.sorted.reverse, amount)
      if (setRes.nonEmpty)
        setRes.min
      else
        -1
    }
  }

  import scala.collection.mutable
  def coinChange(coins: Array[Int], amount: Int): Int = {
    val solutions: mutable.Map[Int, Int] = mutable.Map[Int, Int]()

    def coinChange(amount: Int): Int = {
      if (amount < 0) -1
      else if (amount == 0) 0
      else {
        solutions.getOrElse(amount, {
          val results: Array[Int] = coins
            .reverse
            .map((value: Int) => {
              coinChange(amount - value) + 1
            })
            .filter(_ > 0)

          solutions(amount) =
            if (results.isEmpty) -1
            else results.min

          solutions(amount)
        })
      }
    }

    coinChange(amount)
  }

}
