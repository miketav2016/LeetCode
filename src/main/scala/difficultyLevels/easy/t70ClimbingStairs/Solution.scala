package difficultyLevels.easy.t70ClimbingStairs

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
object Solution extends App {
  def climbStairs(n: Int): Int = {
    n match {
      case 1 => 1
      case 2 => 2
      case _ => climbStairs(n - 1) + climbStairs(n - 2)
    }
  }

  val n = 6
  val res = climbStairs(n)
  println(res)
}
