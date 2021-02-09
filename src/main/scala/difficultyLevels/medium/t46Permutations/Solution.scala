package difficultyLevels.medium.t46Permutations

/**
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 */
object Solution extends App {
  def permute(nums: Array[Int]): List[List[Int]] = {
    nums.permutations.map(_.toList).toList
  }

  val nums = Array(1, 2, 3)
  val res0 = permute(nums)

  def factorial(n: Int): BigInt = {
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }

  println(factorial(nums.length) == res0.length)
}
