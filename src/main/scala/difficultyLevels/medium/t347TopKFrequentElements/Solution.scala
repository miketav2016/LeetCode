package difficultyLevels.medium.t347TopKFrequentElements

import scala.collection.immutable.ListMap

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 */

object Solution extends App {
  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    val res = nums.foldLeft(Map[Int, Int]()) { case (acc, cur) => acc + (cur -> (acc.getOrElse(cur, 0) + 1)) }
    ListMap(res.toSeq.sortWith(_._2 > _._2): _*).take(k).keys.toArray
  }

  val nums0 = Array(1, 1, 1, 2, 2, 3)
  val nums1 = Array(1)
  val nums2 = Array(-1, -1)
  val nums3 = Array(1, 2)
  val k = 2
  val res0 = topKFrequent(nums0, k)
  println(res0.mkString("Array(", ", ", ")"))
}
