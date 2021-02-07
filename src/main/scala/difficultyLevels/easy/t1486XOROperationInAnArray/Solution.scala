package difficultyLevels.easy.t1486XOROperationInAnArray

object Solution extends App {
  def xorOperation(n: Int, start: Int): Int = {
    (for (i <- 1 until n) yield start + 2 * i).foldLeft(start)((pre,cur) => pre ^ cur)
  }

  val n = 10
  val start = 5
  val res0 = xorOperation(n, start)
  println(res0)
}
