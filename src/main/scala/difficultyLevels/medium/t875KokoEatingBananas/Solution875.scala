package difficultyLevels.medium.t875KokoEatingBananas

/**
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 *
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
 * If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 *
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 */
object Solution875 {
    def minEatingSpeed1(piles: Array[Int], h: Int): Int = {
        if (h == piles.length) piles.max
        else {
            (1 to piles.max).foldLeft(0) { case (res, power) =>
                if (res != 0)
                    return res
                else {
                    val time = eatAll(piles, power, h)
                    if (time > h) 0 else power
                }
            }
        }
    }

    private def eatAll(piles: Array[Int], speed: Int, maxTime: Int): Int = {
        piles.foldLeft(0)((acc, pil) =>
            if (acc > maxTime)
                return acc
            else
                acc + math.ceil(pil.toDouble / speed).toInt
        )
    }

    def minEatingSpeed(piles: Array[Int], h: Int): Int = {
        var left = 1
        var right = piles.max
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (canEatInTime(piles, mid, h)) right = mid - 1
            else left = mid + 1
        }
        left
    }

    private def canEatInTime(piles: Array[Int], speed: Int, maxTime: Int): Boolean = {
        piles.foldLeft(0)((acc, pil) => acc + math.ceil(pil.toDouble / speed).toInt) <= maxTime
    }

    def canEatInTime1(piles: Array[Int], k: Int, h: Int): Boolean = {
        var hours = 0
        for (pile <- piles) {
            val div = pile / k
            hours += div
            if (pile % k != 0) hours += 1
        }
        hours <= h
    }

}
