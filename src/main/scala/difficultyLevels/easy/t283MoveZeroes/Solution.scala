package difficultyLevels.easy.t283MoveZeroes

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
object Solution extends App {
  def moveZeroes(nums: Array[Int]): Unit = {
    var zeroCount: Int = 0
    for (i <- nums.indices) {
      if (nums(i) == 0) {
        zeroCount = zeroCount + 1
      } else if (zeroCount > 0) {
        nums(i - zeroCount) = nums(i)
      }
    }

    for (i <- nums.length - zeroCount until nums.length) {
      nums(i) = 0
    }
  }

  val nums = Array(0, 1, 0, 3, 12)
  val res = moveZeroes(nums)

}
