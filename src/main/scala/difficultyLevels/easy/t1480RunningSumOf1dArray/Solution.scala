package difficultyLevels.easy.t1480RunningSumOf1dArray

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */

object Solution {
  def runningSum(nums: Array[Int]): Array[Int] = {
    nums.foldLeft((0, Array[Int]())) { case ((sum, res), current) => (sum + current, res :+ (sum + current)) }._2
  }
}