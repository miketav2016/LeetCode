package difficultyLevels.easy.t202HappyNumber

import scala.annotation.tailrec

/**
 * Write an algorithm to determine if a number n is happy.
 * happy number is a number defined by the following process:
 *
 * tarting with any positive integer, replace the number by the sum of the squares of its digits.
 * epeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * hose numbers for which this process ends in 1 are happy.
 *
 * eturn true if n is a happy number, and false if not.
 */
object Solution extends App {
  def isHappy(n: Int): Boolean = {
    @tailrec
    def myFoo(n: Int, set: Seq[Long] = Seq()): Boolean = {
      val t = n.toString.toSeq.foldLeft(0L)((acc, cur) => acc + cur.asDigit * cur.asDigit)
      t match {
        case _ if set.contains(t) => false
        case _ if t == 1 => true
        case _ if t < Int.MaxValue => myFoo(t.toInt, set :+ t)
        case _ => false
      }
    }
    myFoo(n)
  }

  val n = 19
  //  val t = n.toString.toSeq.foldLeft(.0)((acc, cur) => acc + math.pow(cur.asDigit, 2))
  println(isHappy(n))
}
