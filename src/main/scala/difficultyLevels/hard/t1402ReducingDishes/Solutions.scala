package difficultyLevels.hard.t1402ReducingDishes

object Solutions extends App {
  def maxSatisfaction(satisfaction: Array[Int]): Int = {
    val sort: Array[Int] = satisfaction.sorted
    sort.foldLeft((Array[Int](), sort)) { case ((acc, arr), _) =>
      (acc :+ (for (i <- arr.indices) yield (i + 1) * arr(i)).sum, arr.tail)
    }._1.max.max(0)
  }

  val satisfaction0 = Array(-1, -8, 0, 5, -9)
  val satisfaction1 = Array(4, 3, 2)
  val satisfaction2 = Array(-1, -4, -5)
  val satisfaction3 = Array(-2, 5, -1, 0, 3, -3)
  val res = maxSatisfaction(satisfaction3)
  println(res)
}
