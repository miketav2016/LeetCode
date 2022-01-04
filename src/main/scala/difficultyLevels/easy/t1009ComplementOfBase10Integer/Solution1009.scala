package difficultyLevels.easy.t1009ComplementOfBase10Integer

import scala.annotation.tailrec

/**
 * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
 *
 * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * Given an integer n, return its complement.
 */
object Solution1009 {
    def bitwiseComplement(n: Int): Int = {
        @tailrec
        def toBinaryString(n: Int, rawAnswer: String = ""): String = {
            n match {
                case 1 => rawAnswer + 1
                case 0 => rawAnswer + 0
                case _ if n % 2 == 1 => toBinaryString(n / 2, rawAnswer + 1)
                case _ if n % 2 == 0 => toBinaryString(n / 2, rawAnswer + 0)
            }
        }

        def binaryToIntInversion(binaryString: String): Int = {
            binaryString.foldLeft(0, 0) { case ((int, pow), char) =>
                if (char != 49)
                    ((int + math.pow(2, pow)).toInt, pow + 1)
                else
                    (int, pow + 1)
            }._1
        }

        binaryToIntInversion(toBinaryString(n))
    }
}
