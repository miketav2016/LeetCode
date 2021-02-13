package difficultyLevels.easy.t1662CheckIfTwoStringArraysAreEquivalent

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * A string is represented by an array if the array elements concatenated in order forms the string.
 */
object Solution extends App {
  def arrayStringsAreEqual(word1: Array[String], word2: Array[String]): Boolean = {
    word1.mkString == word2.mkString
  }

  val word1 = Array("ab", "c")
  val word2 = Array("a", "bc")
  val res = arrayStringsAreEqual(word1, word2)
  println(res)
}
