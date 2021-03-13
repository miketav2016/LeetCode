package marchLeetCodingChallenge2021.week2March8_14

import scala.collection.immutable.HashMap

/**
 * Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.
 * We make a binary tree using these integers, and each number may be used for any number of times.
 * Each non-leaf node's value should be equal to the product of the values of its children.
 * Return the number of binary trees we can make. The answer may be too large so return the answer modulo 109 + 7.
 */
object Solution13BinaryTreesWithFactors {
  def numFactoredBinaryTrees0(arr: Array[Int]): Int = {
    var dp = arr.sorted.foldLeft(HashMap[Int, Long]())((acc, key) => acc + (key -> 1))
    val sortArr = arr.sorted
    var res = 0L
    val mod = 1e9.toLong + 7
    for (i <- arr.indices) {
      dp += (sortArr(i) -> 1)
      for (j <- 0 until i) {
        if (sortArr(i) % sortArr(j) == 0) {
          dp += sortArr(i) -> (dp(sortArr(i)) + dp(sortArr(j)) * dp.getOrElse(sortArr(i) / sortArr(j), 0L)) % mod
        }
      }
      res = (res + dp(sortArr(i))) % mod
    }
    res.toInt
  }

  def numFactoredBinaryTrees(arr: Array[Int]): Int = {
    var dp = arr.sorted.foldLeft(HashMap[Int, Long]())((acc, key) => acc + (key -> 1))
    val sortArr = arr.sorted
    var res = 0L
    val mod = 1e9.toLong + 7
    (arr.indices).foreach(i => {
      dp += (sortArr(i) -> 1)
      (0 until i).withFilter(j => sortArr(i) % sortArr(j) == 0).foreach(j => dp += sortArr(i) -> (dp(sortArr(i)) + dp(sortArr(j)) * dp.getOrElse(sortArr(i) / sortArr(j), 0L)) % mod)
      res = (res + dp(sortArr(i))) % mod
    }
    )
    res.toInt
  }

}
