package difficultyLevels.easy.t1389CreateTargetArrayInTheGivenOrder

/**
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 * Return the target array.
 * It is guaranteed that the insertion operations will be valid.
 */
object Solution extends App {
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    index.indices.foldLeft(Array[Int]())((acc, in) => {
      val (l, r) = acc.splitAt(index(in))
      l ++ Array(nums(in)) ++ r
    })
  }

  val nums = Array(0, 1, 2, 3, 4)
  val index = Array(0, 1, 2, 2, 1)
  val res = createTargetArray(nums, index)
  println(res.mkString(" "))
}
