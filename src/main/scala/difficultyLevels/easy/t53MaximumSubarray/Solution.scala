package difficultyLevels.easy.t53MaximumSubarray

/**
 * Given an integer array nums,
 * find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
object Solution extends App {
  def maxSubArray(nums: Array[Int]): Int = {
    nums match {
      case Array(a) => a
      case _ =>
        nums.foldLeft((Array[Int](), 0)) { case ((acc, sum), cur) =>
          val tmp = sum + cur
          (acc :+ tmp, tmp)
        }._1.max.max(maxSubArray(nums.tail))
    }
  }

  def maxSubArray1(nums: Array[Int]): Int = {
    nums.tail.foldLeft((nums.head, nums.head)) { case ((gMax, cMax), cur)=>
      val newCMax = math.max(cMax + cur, cur)
      (math.max(gMax, newCMax), newCMax)
    }._1
  }

  val nums0 = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
  val nums1 = Array(1)
  val nums2 = Array(-1)
  val nums3 = Array(-1000)
  val res = maxSubArray1(nums0)
  println(res)
}
