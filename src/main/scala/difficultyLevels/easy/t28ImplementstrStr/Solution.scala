package difficultyLevels.easy.t28ImplementstrStr

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Clarification:
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
object Solution extends App {
  def strStr(haystack: String, needle: String): Int = {
      haystack.indexOf(needle)
  }


  val haystack = "hello"
  val needle = "ll"
  val res = strStr(haystack, needle)
}