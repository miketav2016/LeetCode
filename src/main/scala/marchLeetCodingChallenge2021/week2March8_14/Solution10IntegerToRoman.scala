package marchLeetCodingChallenge2021.week2March8_14


/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 */
object Solution10IntegerToRoman extends App {
  def romanToInt(s: String): Int = {
    (s.tail + " ").foldLeft((0, s.head.toString)) { case ((acc, buf), cur) =>
      buf match {
        case "I" if cur != 'V' && cur != 'X' => (acc + 1, cur.toString)
        case "IV" => (acc + 4, cur.toString)
        case "IX" => (acc + 9, cur.toString)
        case "V" => (acc + 5, cur.toString)
        case "X" if cur != 'L' && cur != 'C' => (acc + 10, cur.toString)
        case "XL" => (acc + 40, cur.toString)
        case "XC" => (acc + 90, cur.toString)
        case "L" => (acc + 50, cur.toString)
        case "C" if cur != 'D' && cur != 'M' => (acc + 100, cur.toString)
        case "CD" => (acc + 400, cur.toString)
        case "CM" => (acc + 900, cur.toString)
        case "D" => (acc + 500, cur.toString)
        case "M" => (acc + 1000, cur.toString)
        case _ => (acc, buf + cur)
      }
    }._1
  }

  def intToRoman(num: Int): String = {
    def numToListNums(num: Int): List[Int] = {
      if (num > 10) {
        val deka = math.pow(10, num.toString.length - 1).toInt
        val head = num / deka * deka
        val tail = num % (deka)
        head +: numToListNums(tail)
      } else
        num +: Nil
    }

    val tmp = numToListNums(num)
    tmp.foldLeft("")((acc, n) => n match {
      case m if m >= 1000 => acc + ("M" * (m / 1000))
      case cd if cd >= 100 => cd match {
        case 500 => acc + "D"
        case 900 => acc + "CM"
        case 400 => acc + "CD"
        case d if d > 500 => acc + "D" + ("C" * (d / 100 - 5))
        case c if c < 500 => acc + ("C" * (c / 100))
      }
      case xl if xl >= 10 => xl match {
        case 50 => acc + "L"
        case 90 => acc + "XC"
        case 40 => acc + "XL"
        case l if l > 50 => acc + "L" + ("X" * (l / 10 - 5))
        case x if x < 50 => acc + ("X" * (x / 10))
      }
      case 5 => acc + "V"
      case 9 => acc + "IX"
      case 4 => acc + "IV"
      case x if x > 5 => acc + "V" + ("I" * (x / 1 - 5))
      case i if i < 5 => acc + ("I" * (i / 1))
    })
  }
}
