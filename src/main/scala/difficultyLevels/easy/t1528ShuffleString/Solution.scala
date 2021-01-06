package difficultyLevels.easy.t1528ShuffleString

/**
 * Given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * Return the shuffled string.
 */
object Solution extends App {
  def restoreString(s: String, indices: Array[Int]): String = {
    s.zip(indices).sortBy(_._2).foldLeft("") { case (acc, (cur, _)) => acc + cur }
  }

  val s = "codeleet"
  val indices = Array(4, 5, 6, 7, 0, 2, 1, 3)
  val res = restoreString(s, indices)
  val t = "leetcode"
  println(res)
}
