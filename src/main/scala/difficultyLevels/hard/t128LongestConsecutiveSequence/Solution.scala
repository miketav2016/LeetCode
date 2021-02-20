package difficultyLevels.hard.t128LongestConsecutiveSequence

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * Constraints:
 * 0 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 */
object Solution extends App {
  def longestConsecutive(nums: Array[Int]): Int = {
    if (nums.isEmpty)
      0
    else {
      val sortedSet = collection.SortedSet(nums: _*).union(Set(1000000002))
      sortedSet.tail.foldLeft(1, sortedSet.head, List[Int]()) { case ((acc, prev, c), cur) => if (cur - 1 == prev)
        (acc + 1, cur, c)
      else
        (1, cur, c :+ acc)
      }._3.max
    }
  }

  val nums0 = Array(100, 4, 200, 1, 3, 2)
  val nums1 = Array(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
  val nums2 = Array(0, 1, 2, 3, 99, 5, 6, 7, 8, 9)
  val nums = Array[Int]()
  val res = longestConsecutive(nums)
  println(res)
}
