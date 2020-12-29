package difficultyLevels.easy.t1470ShuffleTheArray

import scala.collection.LazyZip2

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
object Solution extends App {
  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    val (x, y) = nums.splitAt(n)
    (for (i <- x.indices) yield Array(x(i), y(i))).flatten.toArray
  }

  def shuffle1(nums: Array[Int], n: Int = nums.length / 2): Array[Int] = {
    (for (i <- 0 until n) yield Seq(nums(i), nums(n + i))).flatten.toArray
  }

  val nums = Array(2, 5, 1, 3, 4, 7)
  val n = 3
  val res = shuffle(nums, n)
  val res1 = shuffle1(nums)
  println(res.mkString("Array(", ", ", ")"))
  println(res1.mkString("Array(", ", ", ")"))
}
