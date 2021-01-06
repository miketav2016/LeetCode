package difficultyLevels.easy.t1313DecompressRunLengthEncodedList

/**
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 * Return the decompressed list.
 */
object Solution extends App {
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    nums.grouped(2).foldLeft(Array[Int]()) { case (acc, Array(f, v)) =>
      acc ++ Array.fill(f)(v)
    }
  }

  val nums = Array(1, 2, 3, 4)
  val t0 = Array(2, 4, 4, 4)
  val res0 = decompressRLElist(nums)
  println(res0.mkString("Array(", ", ", ")"))
}
