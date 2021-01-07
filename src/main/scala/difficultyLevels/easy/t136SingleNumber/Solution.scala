package difficultyLevels.easy.t136SingleNumber

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 */

object Solution extends App {
  def singleNumber(nums: Array[Int]): Int = {
    nums.foldLeft(Map[Int, Int]()) { case (map, cur) => map + (cur -> (1 + map.getOrElse(cur, 0))) }.find(_._2 == 1).get._1
  }

  def singleNumber1(nums: Array[Int]): Int = {
    val sorted = nums.sorted
    sorted.tail.foldLeft((sorted.head, 1)) { case ((res, num), cur) =>
      if (res == cur)
        (res, num + 1)
      else if (num == 2)
        (cur, 1)
      else
        (res, num)
    }._1
  }

  def singleNumber2(nums: Array[Int]): Int = {
    nums.sorted.foldLeft((Int.MinValue, Int.MinValue)) { case ((n, res), cur) => cur match {
      case _ if cur == n => (n, res + 1)
      case _ if cur != n && res == 1 => (n, 1)
      case _ => (cur, 1)
    }
    }._1
  }

  val nums0 = Array(2, 2, 1)
  val nums1 = Array(4, 1, 2, 1, 2)
  val nums2 = Array(1)
  val res = singleNumber2(nums1)
  println(res)

}
