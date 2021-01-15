package difficultyLevels.easy.t204CountPrimes

import scala.math.BigDecimal.int2bigDecimal

/**
 * Count the number of prime numbers less than a non-negative number, n.
 */
object Solution extends App {
  def countPrimes(n: Int): Int = {
    (1 until n).count(n => n.toBigInt.isProbablePrime(5))
  }
  println(countPrimes(10))
}
