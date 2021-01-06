package difficultyLevels.easy.t1281SubtractTheProductAndSumOfDigitsOfAnInteger

/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
object Solution extends App {
  def subtractProductAndSum(n: Int): Int = {
    val (p, m) = n.toString.map(_.asDigit).foldLeft((0, 1)) { case ((p, m), cur) =>
      (p + cur, m * cur)
    }
    m - p
  }

  val n = 234
  val res = subtractProductAndSum(n)
  val t = 15
  println(res)
}
