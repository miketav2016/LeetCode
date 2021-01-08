package difficultyLevels.easy.t169MajorityElement

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
object Solution extends App {
  def majorityElement(nums: Array[Int]): Int = {
    nums.foldLeft(Map[Int, Int]()) { case (map, cur) => map + (cur -> (map.getOrElse(cur, 0) + 1)) }.find(_._2 > nums.length / 2).map(_._1).getOrElse(0)
  }

  val nums0 = Array(2, 2, 1, 1, 1, 2, 2)
  val res = majorityElement(nums0)
  println(res)
}
