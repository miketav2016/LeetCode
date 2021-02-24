package difficultyLevels.medium.t50PowXN


/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e. x^n).
 */
object Solution extends App {
  def myPow(x: Double, n: Int): Double = {
    import scala.annotation.tailrec
    @tailrec
    def powF(x: Double, n: Int, res: Double): Double = {
      println(res)
      n match {
        case _ if x == 1 => 1
        case p if p != 0 && math.abs(res) < Math.pow(5, -10) => 0
        case 0 => 1
        case p if p == 1 => res * x
        case p if p == -1 => 1 / (res * x)
        case p if p > 0 => powF(x, n - 1, res * x)
        case p if p < 0 => powF(x, n + 1, res * x)
      }
    }

    powF(x, n, 1)
  }

  //  println(myPow(2, 10))
  //  println(myPow(2, -10))
  //  println(myPow(0, -10))
  //  println(myPow(0, 10))
  println(myPow(0.00001, 2147483647))
}
