package difficultyLevels.easy.t191NumberOf1Bits

import scala.annotation.tailrec

/**
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 * Note:
 * Note that in some languages such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type.
 * It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3 above, the input represents the signed integer. -3.
 * Follow up: If this function is called many times, how would you optimize it?
 */
object Solution extends App {
  // you need treat n as an unsigned value
  def hammingWeight(n: Long): Int = {
    (math.abs(n)).toBinaryString.count('1' == _)
  }

  def hammingWeight1(n: Int): Int = {
    @tailrec
    def bits(i: Long, sofar: Int = 0): Int = if (i == 0) sofar else bits(i >> 1, (1 & i).toInt + sofar)

    bits(n)
  }

  println(hammingWeight(4294967293l))
  //  println((math.abs(00000000000000000000000000001011)).toBinaryString.count('1' == _))
  //  println((math.abs(11111111111111111111111111111101)).toBinaryString.count('1' == _))
}
