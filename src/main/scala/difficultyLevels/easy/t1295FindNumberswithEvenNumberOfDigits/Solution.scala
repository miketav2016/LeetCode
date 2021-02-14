package difficultyLevels.easy.t1295FindNumberswithEvenNumberOfDigits

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
object Solution extends App {
  def findNumbers(nums: Array[Int]): Int = {
    nums.foldLeft(0)((acc, cur) => acc + (if(cur.toString.length % 2 ==0) 1 else 0))
  }

  val nums = Array(12, 345, 2, 6, 7896)
  val res = findNumbers(nums)
  println(res)
}
