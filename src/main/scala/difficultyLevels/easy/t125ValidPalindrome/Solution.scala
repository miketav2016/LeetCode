package difficultyLevels.easy.t125ValidPalindrome


object Solution extends App {
  def isPalindrome(s: String): Boolean = {
    val str = "[0-9a-zA-Z]".r.findAllMatchIn(s.toLowerCase).foldLeft("")((acc, cur) => acc + cur)
    str == str.reverse
  }

  val s0 = "A man, a plan, a canal: Panama"
  val s1 = "race a car"
  val s2 = "0P"
  println(isPalindrome(s2))
}
