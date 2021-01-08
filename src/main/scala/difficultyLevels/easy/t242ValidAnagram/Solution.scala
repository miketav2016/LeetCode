package difficultyLevels.easy.t242ValidAnagram

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 */
object Solution extends App {
  def isAnagram(s: String, t: String): Boolean = {
    s.sorted == t.sorted
  }

  val s = "anagram"
  val t = "nagaram"
  println(isAnagram(s,t))
}
