package marchLeetCodingChallenge2021.week3March

import scala.annotation.tailrec

/**
 * Starting with a positive integer N, we reorder the digits in any order (including the original order) such that the leading digit is not zero.
 * Return true if and only if we can do this in a way such that the resulting number is a power of 2.
 */
object Solution21ReorderedPowerOf2 {
  def reorderedPowerOf2(N: Int): Boolean = {
    @tailrec
    def countNum(num: Int, res: Array[Int] = Array.fill(10)(0)): Array[Int] = {
      if (num < 10) {
        res(num) += 1
        res
      } else {
        res(num % 10) += 1
        countNum(num / 10, res)
      }
    }

    @tailrec
    def isPow2(data: Array[Int], pow: Int = 0): Boolean = {
      pow match {
        case _ if pow < 31 =>
          if (data sameElements countNum(1 << pow))
            true
          else
            isPow2(data, pow + 1)
        case _ => false
      }
    }

    isPow2(countNum(N))
  }
}
