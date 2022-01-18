package difficultyLevels.easy.t605CanPlaceFlowers


/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 */
object Solution605 {
    def canPlaceFlowersV0(flowerbed: Array[Int], n: Int): Boolean = {
        flowerbed.indices.foldLeft(0)((acc, ind) =>
            if (flowerbed(ind) == 0 && (ind == 0 || flowerbed(ind - 1) == 0) && (ind == flowerbed.length - 1 || flowerbed(ind + 1) == 0)) {
                flowerbed(ind) = 1
                acc + 1
            } else {
                if (acc >= n) return true
                acc
            }
        )
        false
    }

    def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
        flowerbed.indices.foldLeft(0)((acc, ind) =>
            if (flowerbed(ind) == 0 && (ind == 0 || flowerbed(ind - 1) == 0) && (ind == flowerbed.length - 1 || flowerbed(ind + 1) == 0)) {
                flowerbed(ind) = 1
                if (acc + 1 >= n) return true
                acc + 1
            } else {
                if (acc >= n) return true
                acc
            }
        )
        false
    }

}
