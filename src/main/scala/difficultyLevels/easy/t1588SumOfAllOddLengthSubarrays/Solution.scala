package difficultyLevels.easy.t1588SumOfAllOddLengthSubarrays

/**
 * Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
 * A subarray is a contiguous subsequence of the array.
 * Return the sum of all odd-length subarrays of arr.
 */
object Solution extends App {
  def sumOddLengthSubarrays(arr: Array[Int]): Int = {
    (for (i <- 0 to arr.length) yield {
      if (i % 2 == 1) {
        arr.sliding(i).map(_.sum).sum
      } else 0
    }).sum
  }

  val arr = Array(1, 4, 2, 5, 3)
  val res = sumOddLengthSubarrays(arr)
  println(res)
}
