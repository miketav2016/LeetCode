package difficultyLevels.easy.t605CanPlaceFlowers

import difficultyLevels.easy.t605CanPlaceFlowers.Solution605.canPlaceFlowers
import org.scalatest.funsuite.AnyFunSuite

class Solution605Test extends AnyFunSuite {

    test("testCanPlaceFlowers0") {
        val flowerbed = Array(1, 0, 0, 0, 1)
        val n = 1
        assert(canPlaceFlowers(flowerbed, n))
    }

    test("testCanPlaceFlowers1") {
        val flowerbed = Array(1, 0, 0, 0, 1)
        val n = 2
        assert(!canPlaceFlowers(flowerbed, n))
    }

}
