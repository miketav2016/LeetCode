package difficultyLevels.easy.t88MergeSortedArray

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 */
object Solution extends App {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    for (i <- nums2.indices; t = m + i) nums1(t) = nums2(i)
    val tmp = nums1.sorted
    for (i <- nums1.indices) nums1(i) = tmp(i)
  }

  val nums1 = Array(1, 2, 3, 0, 0, 0)
  val m = 3
  val nums2 = Array(2, 5, 6)
  val n = 3
  val nums11 = Array(1)
  val m1 = 1
  val nums22 = Array[Int]()
  val n1 = 0
  merge(nums11, m1, nums22, n1)
  println(nums11.mkString("Array(", ", ", ")"))
}
