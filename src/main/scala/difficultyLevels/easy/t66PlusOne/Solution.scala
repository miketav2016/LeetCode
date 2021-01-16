package difficultyLevels.easy.t66PlusOne

object Solution extends App {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val t = (digits.reverse.head + 1) +: digits.reverse.tail
    digits.foldRight((1, Array[Int]())) { case (cur, (flag, acc)) =>
      val tmp = cur + flag
      if (tmp > 9)
        (1, acc :+ (tmp - 10))
      else
        (0, acc :+ tmp)
    }._2
    val tt = t.reverse
    (if (tt.head > 9)
      Array(1, tt.head - 10) ++  tt.tail
    else
      tt
      )

  }

  /**
   * for (i <- digits.length - 1 to 0 by -1) {
      if (digits(i) < 9) {
        digits(i) += 1
        return digits
      }
      digits(i) = 0
    }
    1 +: digits
   */

  val digits0 = Array(1, 2, 3)
  val digits1 = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
  val digits2 = Array(0, 0)
  val digits3 = Array(0, 0, 0)
  val digits4 = Array(6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3)
  val digits5 = Array(9)
  val digits6 = Array(9,9)
  val res = plusOne(digits6)
  println(res.mkString(" "))
}
