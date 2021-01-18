package difficultyLevels.easy.t20ValidParentheses

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
object Solution extends App {
  def isValid(s: String): Boolean = {
    s.tail.foldLeft(s.head.toString)((acc, cur) => cur match {
      case ')' if acc.nonEmpty && acc.head == '(' => acc.tail
      case ']' if acc.nonEmpty && acc.head == '[' => acc.tail
      case '}' if acc.nonEmpty && acc.head == '{' => acc.tail
      case _ => cur +: acc
    }).isEmpty
  }

  val s0 = "()[]{}"
  val s1 = "(]"
  val s2 = "([)]"
  val s3 = "{[]}"
  val s4 = "]"
  val s5 = "(){}}{"
  println(isValid(s5))
}
