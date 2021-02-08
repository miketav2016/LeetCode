package difficultyLevels.easy.t38CountAndSay

object Solution extends App {

  def countAndSay(n: Int): String = {
    def say(string: String): String = {
      (string + " ").foldLeft(("", string.head, 0)) { case ((acc, t, n), cur) => cur match {
        case x if x == t => (acc, t, n + 1)
        case x if x != t => (acc + n + t, cur, 1)
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
