package difficultyLevels.easy.t350IntersectionOfTwoArraysII

/**
 * Given two arrays, write a function to compute their intersection.
 */
object Solution extends App {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    nums1.intersect(nums2)
  }

  val nums1 = Array(1, 2, 2, 1)
  val nums2 = Array(2, 2)
  val res = intersect(nums1, nums2)
  println(res.mkString("Array(", ", ", ")"))
}
