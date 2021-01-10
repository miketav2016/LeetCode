package difficultyLevels.easy.t268MissingNumber

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */
object Solution extends App {
  def missingNumber(nums: Array[Int]): Int = {
    (0 to nums.length).diff(nums).head
  }

  val nums0 = Array[Int]()
  val nums1 = Array(3, 0, 1)
  val nums2 = Array(3, 0, 1)
  val res = missingNumber(nums0)
  println(res)
  //  val t = (0 to nums.length)
  //  println(t.mkString(" "))
}
