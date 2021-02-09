package difficultyLevels.easy.t38CountAndSay

/**
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 * countAndSay(1) = "1"
 * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into
 * a different digit string.
 * To determine how you "say" a digit string, split it into the minimal number of groups so that each group
 * is a contiguous section all of the same character. Then for each group, say the number of characters,
 * then say the character. To convert the saying into a digit string, replace the counts with a number and
 * concatenate every saying.
 */
object Solution extends App {

  def countAndSay(n: Int): String = {
    def say(string: String): String = {
      (string + " ").tail.foldLeft(("", string.head, 1)) { case ((acc, c, i), cur) => cur match {
        case x if x == c => (acc, c, i + 1)
        case x if x != c => (acc + i + c, cur, 1)
      }
      }._1
    }

    n match {
      case 1 => "1"
      case _ => say(countAndSay(n - 1))
    }
  }

  println(countAndSay(7))
}
