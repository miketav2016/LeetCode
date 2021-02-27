package difficultyLevels.easy.t1614MaximumNestingDepthOfTheParentheses

object Solution1614 {
  def maxDepth(s: String): Int = {
    s.foldLeft(0, 0) { case ((acc, max), cur) => cur match {
      case '(' => (acc + 1, max)
      case ')' => (acc - 1, if (acc > max) acc else max)
      case _ => (acc, max)
    }
    }._2
  }
}
