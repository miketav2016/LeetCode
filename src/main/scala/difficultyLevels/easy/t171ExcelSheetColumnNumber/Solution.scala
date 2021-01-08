package difficultyLevels.easy.t171ExcelSheetColumnNumber

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
object Solution extends App {
  def titleToNumber0(s: String): Int = {
    s.reverse.foldLeft(0, 0) { case ((acc, n), char) => (acc + (char.toInt - 64) + math.pow(26, n).toInt, n + 1)
    }._1
  }
  def titleToNumber1(s: String): Int = {
    s.foldRight(0, 0) { case (char, (acc, n)) => (acc + (char.toInt - 64) * math.pow(26, n).toInt, n + 1)
    }._1
  }

  val t = "AB"
  println(titleToNumber1(t))
}
