package difficultyLevels.hard.t1463CherryPickupII

import difficultyLevels.hard.t1463CherryPickupII.Solution1463.cherryPickup
import org.scalatest.funsuite.AnyFunSuite

class Solution1463Test extends AnyFunSuite {

    test("testCherryPickup0") {
        val grid = Array(
            Array(3, 1, 1),
            Array(2, 5, 1),
            Array(1, 5, 5),
            Array(2, 1, 1))
        assert(cherryPickup(grid) == 24)
    }

    test("testCherryPickup1") {
        val grid = Array(
            Array(1, 0, 0, 0, 0, 0, 1),
            Array(2, 0, 0, 0, 0, 3, 0),
            Array(2, 0, 9, 0, 0, 0, 0),
            Array(0, 3, 0, 5, 4, 0, 0),
            Array(1, 0, 2, 3, 0, 0, 6))
        assert(cherryPickup(grid) == 28)
    }
}
