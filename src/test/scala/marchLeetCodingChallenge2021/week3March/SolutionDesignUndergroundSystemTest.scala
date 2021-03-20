package marchLeetCodingChallenge2021.week3March

import org.scalatest.funsuite.AnyFunSuite

class SolutionDesignUndergroundSystemTest extends AnyFunSuite {

  test("testUndergroundSystem0") {
    val undergroundSystem = new SolutionDesignUndergroundSystem()
    undergroundSystem.checkIn(10, "Leyton", 3)
    undergroundSystem.checkOut(10, "Paradise", 8)
    assert(undergroundSystem.getAverageTime("Leyton", "Paradise") === 5.0) // return 5.00000
    undergroundSystem.checkIn(5, "Leyton", 10)
    undergroundSystem.checkOut(5, "Paradise", 16)
    assert(undergroundSystem.getAverageTime("Leyton", "Paradise") == 5.5) // return 5.50000
    undergroundSystem.checkIn(2, "Leyton", 21)
    undergroundSystem.checkOut(2, "Paradise", 30)
    assert(undergroundSystem.getAverageTime("Leyton", "Paradise") == 6.666666666666667) // return 6.66667
  }
  test("testUndergroundSystem1") {
    val undergroundSystem = new SolutionDesignUndergroundSystem()
    undergroundSystem.checkIn(45, "Leyton", 3)
    undergroundSystem.checkIn(32, "Paradise", 8)
    undergroundSystem.checkIn(27, "Leyton", 10)
    undergroundSystem.checkOut(45, "Waterloo", 15)
    undergroundSystem.checkOut(27, "Waterloo", 20)
    undergroundSystem.checkOut(32, "Cambridge", 22)
    assert(undergroundSystem.getAverageTime("Paradise", "Cambridge") == 14.0) // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
    assert(undergroundSystem.getAverageTime("Leyton", "Waterloo") == 11.0) // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
    undergroundSystem.checkIn(10, "Leyton", 24)
    assert(undergroundSystem.getAverageTime("Leyton", "Waterloo") == 11.0) // return 11.00000
    undergroundSystem.checkOut(10, "Waterloo", 38)
    undergroundSystem.getAverageTime("Leyton", "Waterloo")
  }
}
