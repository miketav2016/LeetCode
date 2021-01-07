package difficultyLevels.easy.t412FizzBuzz

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */
object Solution extends App {
  def fizzBuzz(n: Int): List[String] = {
    (1 to n).foldLeft(List[String]())((acc, cur) => cur match {
      case n if n % 15 == 0 => acc :+ "FizzBuzz"
      case n if n % 3 == 0 => acc :+ "Fizz"
      case n if n % 5 == 0 => acc :+ "Buzz"
      case _ => acc :+ cur.toString
    })
  }
  println(fizzBuzz(15))
}
