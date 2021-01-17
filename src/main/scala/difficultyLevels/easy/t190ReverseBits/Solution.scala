package difficultyLevels.easy.t190ReverseBits

import scala.annotation.tailrec

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * Note:
 * Note that in some languages such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 * Follow up:
 * If this function is called many times, how would you optimize it?
 */
object Solution extends App {
  // you need treat n as an unsigned value
  def reverseBits(x: Int): Int = {
    @tailrec
    def reverse(in: Int, n: Int = 32, out: Int = 0): Int =
      if (n == 0) out
      else reverse(in >>> 1, n - 1, (out << 1) | (in & 1)) //magic

    reverse(x)
  }

}