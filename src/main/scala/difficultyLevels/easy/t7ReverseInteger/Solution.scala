package difficultyLevels.easy.t7ReverseInteger
/**Given a 32-bit signed integer, reverse digits of an integer.
 * Note:
 * Assume we are dealing with an environment that could only store integers within the 32-bit signed
 * integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when
 * the reversed integer overflows.
 */
object Solution {
  def reverse(x: Int): Int = {
    x match {
      case v: Int if v > 0 => val res = x.toString.reverse.toLong
        if (math.abs(res) > Int.MaxValue) 0 else res.toInt
      case v: Int if v == 0 => 0
      case v: Int if v < 0 => val res = -1 * x.toString.tail.reverse.toLong
        if (math.abs(res) > Int.MaxValue) 0 else res.toInt
    }
  }
}
