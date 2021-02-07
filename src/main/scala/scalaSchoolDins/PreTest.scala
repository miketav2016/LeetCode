package scalaSchoolDins

object PreTest extends App {
  def replaceFold(list: List[String], replacing: String, replacement: String): List[String] = {
    list.foldLeft(List[String]())((acc, cur) => acc :+ (if (cur == replacing) replacement else cur))
  }
  def replaceMap(list: List[String], replacing: String, replacement: String): List[String] = {
    list.map{
      case cur if cur == replacing => replacement
      case x => x
    }
  }

  val list = List("a", "s", "d", "f", "g", "h", "d", "k", "l", "q")
  val res = replaceFold(list, "d", "!!!")
  println(replaceMap(list, "d", "!!!") == replaceFold(list, "d", "!!!"))
  println(res)
}
