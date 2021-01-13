package difficultyLevels.easy.t326PowerOfThree

import scala.annotation.tailrec

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 */
object Solution extends App {
  @tailrec
  def isPowerOfThree(n: Int): Boolean = {
    n match {
      case 0 => false
      case 1 => true
      case _ if (n / 3) == 1 && n % 3 == 0 => true
      case _ if n % 3 == 0 => isPowerOfThree(n / 3)
      case _ => false
    }
  }

  val n = -9
  val res = isPowerOfThree(n)
  println(res)
}
