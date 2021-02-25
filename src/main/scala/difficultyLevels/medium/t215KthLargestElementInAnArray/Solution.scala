package difficultyLevels.medium.t215KthLargestElementInAnArray

object Solution extends App {
  def findKthLargest(nums: Array[Int], k: Int): Int = {
    nums.sorted.reverse(k)
  }

  val input = Array(3, 2, 1, 5, 6, 4)
  val k = 2
  val res = findKthLargest(input, k)
  println(res)
}
