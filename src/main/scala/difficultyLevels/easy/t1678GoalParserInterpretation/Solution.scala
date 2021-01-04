package difficultyLevels.easy.t1678GoalParserInterpretation

/**
 * You own a Goal Parser that can interpret a string command.
 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
 * The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 * Given the string command, return the Goal Parser's interpretation of command.
 */
object Solution extends App {


  def interpret(command: String): String = {
    command.replace("()", "o").replace("(al)", "al")
  }

  val command0 = "G()(al)"
  val command1 = "G()()()()(al)"
  val command2 = "(al)G(al)()()G"
  val res0 = interpret(command0)
  println(res0 == "Goal")
  val res1 = interpret(command1)
  println(res1 == "Gooooal")
  val res2 = interpret(command2)
  println(res2)
  println(res2 == "alGalooG")
}
