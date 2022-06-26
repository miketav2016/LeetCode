package difficultyLevels.medium.t1423MaximumPointsYouCanObtainfromCards

import org.scalatest.funsuite.AnyFunSuite

class Solution1423Test extends AnyFunSuite {

    test("testCarPooling0") {
        val cardPoints = Array(1,2,3,4,5,6,1)
        val k = 3
        assert(Solution1423.maxScore(cardPoints, k) == 12)
    }
    test("testCarPooling1") {
        val cardPoints = Array(2,2,2)
        val k = 2
        assert(Solution1423.maxScore(cardPoints, k) == 4)
    }
    test("testCarPooling2") {
        val cardPoints = Array(9,7,7,9,7,7,9)
        val k = 7
        assert(Solution1423.maxScore(cardPoints, k) == 55)
    }
    test("testCarPooling3") {
        val cardPoints = Array(1,79,80,1,1,1,200,1)
        val k = 3
        assert(Solution1423.maxScore(cardPoints, k) == 202)
    }
}
