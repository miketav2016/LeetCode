package difficultyLevels.easy.t448FindAllNumbersDisappearedInAnArray

import difficultyLevels.easy.t448FindAllNumbersDisappearedInAnArray.Solution448.findDisappearedNumbers
import org.scalatest.funsuite.AnyFunSuite

class Solution448Test extends AnyFunSuite {

    test("testFindDisappearedNumbers0") {
        val nums = Array(4, 3, 2, 7, 8, 2, 3, 1)
        assert(findDisappearedNumbers(nums) == List(5, 6))
    }

}
