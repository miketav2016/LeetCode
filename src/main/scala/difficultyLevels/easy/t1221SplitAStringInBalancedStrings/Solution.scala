package difficultyLevels.easy.t1221SplitAStringInBalancedStrings

/**
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 * Given a balanced string s, split it in the maximum amount of balanced strings.
 * Return the maximum amount of split balanced strings.
 */
object Solution extends App {
  def balancedStringSplit(s: String): Int = {
    s.foldLeft(0, 0, 0) { case ((acc, ln, rn), cur) =>
      val (l,r) = cur match {
        case 'L' => (ln + 1, rn)
        case 'R' => (ln, rn + 1)
      }
      if (l == r)
        (acc + 1, 0, 0)
      else
        (acc, l, r)
    }._1
  }

  val s0 = "RLRRLLRLRL"
  val s1 = "RLLLLRRRLR"
  val s2 = "LLLLRRRR"
  val s = "RLRRRLLRLL"
  val res = balancedStringSplit(s)
  println(res)
}
