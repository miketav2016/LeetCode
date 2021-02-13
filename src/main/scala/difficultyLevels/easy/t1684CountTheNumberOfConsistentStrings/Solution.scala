package difficultyLevels.easy.t1684CountTheNumberOfConsistentStrings

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
 * Return the number of consistent strings in the array words.
 */
object Solution extends App {
  def countConsistentStrings(allowed: String, words: Array[String]): Int = {
    words.foldLeft(0)((acc, str) => acc + (
      if (str.toSeq.forall(ch => allowed.contains(ch)))
        1
      else
        0))

  }

  val allowed = "ab"
  val words = Array("ad", "bd", "aaab", "baa", "badab")
  val res = countConsistentStrings(allowed, words)
  println(res)
}
