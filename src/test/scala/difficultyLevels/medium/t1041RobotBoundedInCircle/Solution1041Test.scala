package difficultyLevels.medium.t1041RobotBoundedInCircle

import difficultyLevels.medium.t1041RobotBoundedInCircle.Solution1041.isRobotBounded
import org.scalatest.funsuite.AnyFunSuite

class Solution1041Test extends AnyFunSuite {

    test("testIsRobotBounded0") {
        val instructions = "GGLLGG"
        assert(isRobotBounded(instructions))
    }

    test("testIsRobotBounded1") {
        val instructions = "GG"
        assert(!isRobotBounded(instructions))
    }

    test("testIsRobotBounded2") {
        val instructions = "GL"
        assert(isRobotBounded(instructions))
    }

    test("testIsRobotBounded3") {
        val instructions = "LLGRL"
        assert(isRobotBounded(instructions))
    }

}
