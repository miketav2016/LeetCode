package difficultyLevels.easy.t172FactorialTrailingZeroes


/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * Follow up: Could you write a solution that works in logarithmic time complexity?
 */
object Solution extends App {
  def trailingZeroes(n: Int): Int = {
    def factorial(n: Int): BigInt = {
      if (n == 0)
        1
      else
        n * factorial(n - 1)
    }

    println(factorial(n))
    factorial(n).toString.foldLeft(0)((acc, cur) => if(cur == '0') acc + 1 else 0)
  }

  println(trailingZeroes(5000))
}
