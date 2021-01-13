package difficultyLevels.easy.t14LongestCommonPrefix

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
object Solution extends App {
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.isEmpty)
      ""
    else {
      //      strs.tail.foldLeft(strs.head)((acc, cur) => acc.intersect(cur))
      strs.tail.foldLeft(strs.head)((acc, cur) => {
        (for (i <- 0 until math.min(cur.length, acc.length)) yield
          if (cur.charAt(i) == acc.charAt(i))
            acc.charAt(i)
          else
            " "
          ).foldLeft("")(_ + _)
      })
    }.takeWhile(_ != ' ')

  }

  val strs0: Array[String] = Array("flower", "flow", "flight")
  val strs1: Array[String] = Array("cir", "car")
  val res = longestCommonPrefix(strs1)
  println(res)
}
