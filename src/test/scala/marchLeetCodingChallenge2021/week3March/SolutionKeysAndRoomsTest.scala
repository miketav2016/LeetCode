package marchLeetCodingChallenge2021.week3March

import marchLeetCodingChallenge2021.week3March.SolutionKeysAndRooms.canVisitAllRooms
import org.scalatest.funsuite.AnyFunSuite

class SolutionKeysAndRoomsTest extends AnyFunSuite {

  test("testCanVisitAllRooms0") {
    val input = List(List(1), List(2), List(3), List())
    assert(canVisitAllRooms(input) === true)
  }
  test("testCanVisitAllRooms1") {
    val input = List(List(1, 3), List(1, 0, 3), List(2), List(0))
    assert(canVisitAllRooms(input) === false)
  }
  test("testCanVisitAllRooms2") {
    val input = List(List(2), List(), List(1))
    assert(canVisitAllRooms(input) === true)
  }

}
