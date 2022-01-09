package difficultyLevels.medium.t1041RobotBoundedInCircle

import scala.annotation.tailrec

/**
 * On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:
 *
 * "G": go straight 1 unit;
 *
 * "L": turn 90 degrees to the left;
 *
 * "R": turn 90 degrees to the right.
 *
 * The robot performs the instructions given in order, and repeats them forever.
 *
 * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 */
object Solution1041 {
    def isRobotBounded(instructions: String): Boolean = {
        @tailrec
        def isRobotBoundedCircle(command: String, position: (Int, Int), direct: (Int, Int)): Boolean = {
            command match {
                case _ if command.isEmpty => position == (0, 0) || direct != (0, 1)
                case _ if command.head == 'G' => isRobotBoundedCircle(command.tail, (position._1 + direct._1, position._2 + direct._2), direct)
                case _ if command.head == 'L' => isRobotBoundedCircle(command.tail, position, (-direct._2, direct._1))
                case _ if command.head == 'R' => isRobotBoundedCircle(command.tail, position, (direct._2, -direct._1))
            }
        }

        if (!instructions.contains("R") && !instructions.contains("L"))
            false
        else
            isRobotBoundedCircle(instructions, (0, 0), (0, 1))
    }
}
