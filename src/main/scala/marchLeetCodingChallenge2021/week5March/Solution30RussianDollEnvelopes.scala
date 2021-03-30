package marchLeetCodingChallenge2021.week5March

/**
 * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
 * One envelope can fit into another if and only if both the width and height of one envelope is greater than the width and height of the other envelope.
 * Return the maximum number of envelopes can you Russian doll (i.e., put one inside the other).
 * Note: You cannot rotate an envelope.
 */
object Solution30RussianDollEnvelopes {
    def maxEnvelopes(envelopes: Array[Array[Int]]): Int = {
        val sortedEnvelop = envelopes.sortWith((a, b) =>
            if (a(0) == b(0))
                (a(1) - b(1)) > 0
            else
                (a(0) - b(0)) > 0
        )
        val dp = Array.fill(envelopes.length)(0)
        dp(0) = 1
        for (i <- 1 until envelopes.length) {
            dp(i) = 1
            for (j <- 0 until i) {
                if (sortedEnvelop(j)(0) > sortedEnvelop(i)(0) &&
                    sortedEnvelop(j)(1) > sortedEnvelop(i)(1) &&
                    dp(i) <= dp(j)) {
                    dp(i) = dp(j) + 1
                }
            }
        }
        dp.max
    }
}
