package marchLeetCodingChallenge2021.week3March

import scala.annotation.tailrec

/**
 * Given an integer array nums, return the length of the longest wiggle sequence.
 * A wiggle sequence is a sequence where the differences between successive numbers strictly alternate between
 * positive and negative. The first difference (if one exists) may be either positive or negative.
 * A sequence with fewer than two elements is trivially a wiggle sequence.
 */
object Solution18WiggleSubsequence {
  def wiggleMaxLength(nums: Array[Int]): Int = {
    if (nums.length < 2) {
      1
    } else {
      @tailrec
      def count(nums: Array[Int], up: Int = 1, down: Int = 1, pre: Int): Int = {
        if (nums.isEmpty) {
          math.max(up, down)
        } else {
          if (nums.head > pre)
            count(nums.tail, down + 1, down, nums.head)
          else if (nums.head < pre)
            count(nums.tail, up, up + 1, nums.head)
          else
            count(nums.tail, up, down, nums.head)
        }
      }

      count(nums.tail, 1, 1, nums.head)
    }
  }
}
