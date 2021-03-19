package marchLeetCodingChallenge2021.week3March

import scala.annotation.tailrec
import scala.collection.mutable

object SolutionKeysAndRooms {
  def canVisitAllRooms(rooms: List[List[Int]]): Boolean = {
    val stackKey = new mutable.Stack[Int]()
    stackKey.push(0)
    var roomsVisit = List.fill(rooms.length)(false)
    roomsVisit = roomsVisit.updated(0, true)

    @tailrec
    def checkRoom(stack: mutable.Stack[Int]): Unit = {
      if (stack.nonEmpty) {
        val node = stack.pop()
        rooms(node).foreach(key =>
          if (!roomsVisit(key)) {
            stack.push(key)
            roomsVisit = roomsVisit.updated(key, true)
          }
        )
        checkRoom(stack)
      }
    }

    checkRoom(stackKey)
    roomsVisit.forall(_ == true)
  }
}
