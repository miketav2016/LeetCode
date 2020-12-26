package difficultyLevels.easy.t665NonDecreasingArray

/**
 * Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
 */
object Solution extends App {
  def checkPossibility(nums: Array[Int]): Boolean = {
    def check(ints: Array[Int]): Boolean = {
      ints.tail.foldLeft((ints.head, true)) { case ((cur, flag), next) =>
        (next, if (cur <= next) flag else false)
      }._2
    }

    val res = (for (i <- 1 until nums.length if nums(i - 1) > nums(i) && nums(i - 1) != nums(i))
      yield (check(nums.dropRight(nums.length - i) ++ nums.drop(i + 1)), check(nums.dropRight(nums.length - i + 1) ++ nums.drop(i)))
      ).unzip
    (res._1.count(_ == false) + res._2.count(_ == false)) < (if (nums.length < 4) 3 else 2)
  }
}
