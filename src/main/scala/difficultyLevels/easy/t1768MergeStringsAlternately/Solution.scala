package difficultyLevels.easy.t1768MergeStringsAlternately

/**
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 */
object Solution extends App {
  def mergeAlternately(word1: String, word2: String): String = {
    word1.zip(word2).foldLeft("")((acc, c12) => acc + c12._1 + c12._2) + (if (word1.length > word2.length) {
      word1.takeRight(word1.length - word2.length)
    } else {
      word2.takeRight(word2.length - word1.length)
    })
  }

  val word1 = "abccccccc"
  val word2 = "pqrst"
  val res = mergeAlternately(word1, word2)
  println(res)

}

