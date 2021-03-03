package marchLeetCodingChallenge2021.week1March1_7

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */
object Solution3MissingNumber {
  def missingNumber(nums: Array[Int]): Int = {
    (0 to nums.length).diff(nums).head
  }
}
