package difficultyLevels.easy.t771JewelsAndStones

/**
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
object Solution extends App {
  def numJewelsInStones(jewels: String, stones: String): Int = {
    jewels.foldLeft(0)((acc, cur) => acc + stones.count(cur == _))
  }

  val jewels = "aA"
  val stones = "aAAbbbb"
  val res = numJewelsInStones(jewels, stones)
  println(res == 3)
}
