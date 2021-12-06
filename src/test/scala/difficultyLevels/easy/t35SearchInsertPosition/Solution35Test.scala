package difficultyLevels.easy.t35SearchInsertPosition

import difficultyLevels.easy.t35SearchInsertPosition.Solution35.searchInsert
import org.scalatest.funsuite.AnyFunSuite

class Solution35Test extends AnyFunSuite {

    test("testSearchInsert0") {
       val nums = Array(1,3,5,6)
       val target = 5
        assert(searchInsert(nums , target) === 2)
    }

    test("testSearchInsert1") {
       val nums = Array(1,3,5,6)
       val target = 2
        assert(searchInsert(nums , target) === 1)
    }
    test("testSearchInsert2") {
       val nums = Array(1,3,5,6)
       val target = 7
        assert(searchInsert(nums , target) === 4)
    }

    test("testSearchInsert3") {
       val nums = Array(1,3,5,6)
       val target = 0
        assert(searchInsert(nums , target) === 0)
    }

    test("testSearchInsert4") {
       val nums = Array(1)
       val target = 0
        assert(searchInsert(nums , target) === 0)
    }

}
