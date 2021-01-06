package difficultyLevels.easy.t1342NumberOfStepsToReduceANumberToZero

/**
 * Given a non-negative integer num, return the number of steps to reduce it to zero.
 * If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
object Solution extends App {
  def numberOfSteps(num: Int): Int = {
    num match {
      case 1 => 1
      case 0 => 0
      case _ if num % 2 == 0 => 1 + numberOfSteps(num/2)
      case _ if num % 2 == 1 => 1 + numberOfSteps(num - 1)
    }
  }

  val num = 0
  var res = numberOfSteps(num)
  val t = 4
  println(res)
}
