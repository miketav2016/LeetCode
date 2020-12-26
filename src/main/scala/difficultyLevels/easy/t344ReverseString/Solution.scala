package difficultyLevels.easy.t344ReverseString

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 */

object Solution {
  def reverseString(s: Array[Char], i: Int = 0, j: Int = -1, isF: Boolean = true): Any = {
    if (i < j) {
      val tmp = s(i)
      s(i) = s(j)
      s(j) = tmp
      reverseString(s, i + 1, j - 1, isF = false)
    } else if (isF)
      reverseString(s, 0, s.length - 1, isF = false)
  }
}
