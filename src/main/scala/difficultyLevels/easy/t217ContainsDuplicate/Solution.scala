package difficultyLevels.easy.t217ContainsDuplicate

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
object Solution extends App {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.foldLeft(Map[Int, Int]())((acc, cur) => acc + (cur -> (acc.getOrElse(cur, 0) + 1))).values.exists(_ >= 2)
  }

  val nums0 = Array(1, 2, 3, 1)
  val nums1 = Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
  println(containsDuplicate(nums1))
}
