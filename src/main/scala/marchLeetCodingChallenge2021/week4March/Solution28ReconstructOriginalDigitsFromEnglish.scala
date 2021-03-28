package marchLeetCodingChallenge2021.week4March

/**
 * Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.
 *
 * Note:
 * Input contains only lowercase English letters.
 * Input is guaranteed to be valid and can be transformed to its original digits. That means invalid inputs such as "abc" or "zerone" are not permitted.
 * Input length is less than 50,000.
 */
object Solution28ReconstructOriginalDigitsFromEnglish {
    def originalDigits(s: String): String = {
        val mapCharsToNum = s.foldLeft(Map[Char, Int]())((acc, char) => acc + (char -> (acc.getOrElse(char, 0) + 1)))
        val digit = Array.fill(10)(0)
        digit(0) = mapCharsToNum.getOrElse('z', 0)
        digit(4) = mapCharsToNum.getOrElse('u', 0)
        digit(6) = mapCharsToNum.getOrElse('x', 0)
        digit(2) = mapCharsToNum.getOrElse('w', 0)
        digit(8) = mapCharsToNum.getOrElse('g', 0)
        digit(5) = mapCharsToNum.getOrElse('f', 0) - digit(4)
        digit(7) = mapCharsToNum.getOrElse('s', 0) - digit(6)
        digit(1) = mapCharsToNum.getOrElse('o', 0) - digit(0) - digit(2) - digit(4)
        digit(3) = mapCharsToNum.getOrElse('t', 0) - digit(8) - digit(2)
        digit(9) = mapCharsToNum.getOrElse('i', 0) - digit(5) - digit(6) - digit(8)
        (for (i <- digit.indices) yield i.toString * digit(i)).mkString("")
    }
}
