package difficultyLevels.medium.t189RotateArray

import difficultyLevels.medium.t189RotateArray.Solution189.rotate
import org.scalatest.funsuite.AnyFunSuite

class Solution189Test extends AnyFunSuite {

    test("testRotate0") {
        val nums = Array(1, 2, 3, 4, 5, 6, 7)
        val k = 3
        val answer = Array(5,6,7,1,2,3,4)
        assert(rotate(nums, k) sameElements answer)

    }

}
