package difficultyLevels.easy.t1365HowManyNumbersAreSmallerThanTheCurrentNumber

object Solution extends App {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    nums.foldLeft(Array[Int]())((acc, cur) => acc :+ nums.count(cur > _))
  }

  val nums = Array(8, 1, 2, 2, 3)
  val nums1 = Array(6, 5, 4, 8)
  val nums2 = Array(7, 7, 7, 7)
  val res = smallerNumbersThanCurrent(nums)
  println(res.mkString(","))
  println(smallerNumbersThanCurrent(nums1).mkString(","))
  println(smallerNumbersThanCurrent(nums2).mkString(","))


}
