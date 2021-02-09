package difficultyLevels.medium.t78Subsets

/**
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 */
object Solution extends App {
  def subsets(nums: Array[Int]): List[List[Int]] = {
    nums.toSet.subsets.map(_.toList).toList
  }

  val nums = Array(1, 2, 3, 4)
  val res0 = subsets(nums)
  println(res0.length == math.pow(2, nums.length))
}
