package difficultyLevels.medium.t875KokoEatingBananas

import difficultyLevels.medium.t875KokoEatingBananas.Solution875.minEatingSpeed
import org.scalatest.funsuite.AnyFunSuite

class Solution875Test extends AnyFunSuite {

    test("testMinEatingSpeed0") {
        val piles = Array(3, 6, 7, 11)
        val h = 8
        assert(minEatingSpeed(piles, h) == 4)
    }

    test("testMinEatingSpeed1") {
        val piles = Array(30, 11, 23, 4, 20)
        val h = 5
        assert(minEatingSpeed(piles, h) == 30)
    }

    test("testMinEatingSpeed2") {
        val piles = Array(30, 11, 23, 4, 20)
        val h = 6
        assert(minEatingSpeed(piles, h) == 23)
    }
}
