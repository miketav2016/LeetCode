package difficultyLevels.easy.t69SqrtX

/**
 * Given a non-negative integer x, compute and return the square root of x.
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 */
object Solution extends App {
  def mySqrt(x: Int): Int = {
    math.sqrt(x).toInt
  }
}
