package marchLeetCodingChallenge2021.week1March1_7

/**
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
 * one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 */
object Solution2SetMismatch {
  def findErrorNums(nums: Array[Int]): Array[Int] = {
    Array(nums.diff(1 to nums.length).head, (1 to nums.length).diff(nums).head)
  }
}
