package difficultyLevels.easy.t1534CountGoodTriplets

/**
 * Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.
 * A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * Where |x| denotes the absolute value of x.
 * Return the number of good triplets.
 */
object Solution extends App {
  def countGoodTriplets(arr: Array[Int], a: Int, b: Int, c: Int): Int = {
    val preRes = for (i <- arr.indices;
                      j <- i + 1 until arr.length;
                      k <- j + 1 until arr.length)
      yield (arr(i), arr(j), arr(k))

    preRes.foldLeft(0) { case (acc, (i, j, k)) => acc + (if (
      math.abs(i - j) <= a &&
        math.abs(j - k) <= b &&
        math.abs(i - k) <= c) 1 else 0)
    }
  }

  val arr = Array(3, 0, 1, 1, 9, 7)
  val a = 7
  val b = 2
  val c = 3
  val res = countGoodTriplets(arr, a, b, c)
  println(res)
}
