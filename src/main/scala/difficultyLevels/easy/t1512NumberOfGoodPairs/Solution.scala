package difficultyLevels.easy.t1512NumberOfGoodPairs

/**
 * Given an array of integers nums.
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs.
 */
object Solution extends App {
  def numIdenticalPairs(nums: Array[Int]): Int = {
    (for (i <- nums.indices;
          j <- i + 1 until nums.length if nums(i) == nums(j)) yield 1).sum
  }


  val nums = Array(1, 2, 3, 1, 1, 3)
  val res = numIdenticalPairs(nums)
  println(res)
  println(res == 4)
  val nums1 = Array(1, 1, 1, 1)
  val res1 = numIdenticalPairs(nums1)
  println(res1)
  println(res1 == 6)
}
