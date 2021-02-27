package difficultyLevels.hard.t315CountOfSmallerNumbersAfterSelf

import scala.annotation.tailrec


object Solution {
  // slow
  def countSmaller0(nums: Array[Int]): List[Int] = {
    (for (i <- nums.indices) yield nums.drop(i).count(nums(i) > _)).toList
  }

  def countSmaller1(nums: Array[Int]): List[Int] = {
    nums.foldRight((List[Int](), List[Int]())) { case (cur, (res, from)) => (from.count(_ < cur) :: res, from :+ cur) }._1
  }

  def countSmaller2(nums: Array[Int]): List[Int] = {
    (for (i <- nums.indices) yield nums.slice(i, nums.length).count(nums(i) > _)).toList
  }

  // 62 / 65 test cases passed.
  def countSmaller3(nums: Array[Int]): List[Int] = {
    @tailrec
    def countS(nums: Array[Int], res: List[Int] = Nil): List[Int] = {
      if (nums.nonEmpty) {
        countS(nums.tail, nums.tail.count(nums.head > _) +: res)
      } else res
    }

    countS(nums).reverse
  }

  def countSmaller(nums: Array[Int]): List[Int] = {
    if (nums.nonEmpty) {
      nums.tail.count(nums.head > _) +: countSmaller(nums.tail)
    } else Nil
  }

}
