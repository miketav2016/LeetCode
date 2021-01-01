package difficultyLevels.easy.t1108DefangingAnIPAddress

/*
* Given a valid (IPv4) IP address, return a defanged version of that IP address.
* A defanged IP address replaces every period "." with "[.]".
* Input: address = "1.1.1.1"
* Output: "1[.]1[.]1[.]1"
* Input: address = "255.100.50.0"
* Output: "255[.]100[.]50[.]0"
* */
object Solution extends App {
  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }

  def defangIPaddr1(address: String): String = {
    address.split('.').map(ip => ip + "[.]").mkString("").dropRight(3)
  }


  val ipv40 = "1.1.1.1"
  val ipv41 = "255.100.50.0"
  val res = defangIPaddr(ipv40)
  //  println(res == "1[.]1[.]1[.]1")
  println(defangIPaddr1(ipv41) == "255[.]100[.]50[.]0")
}
