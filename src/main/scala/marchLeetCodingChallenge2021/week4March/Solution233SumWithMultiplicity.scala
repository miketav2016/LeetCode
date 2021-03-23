package marchLeetCodingChallenge2021.week4March

/**
 * Given an integer array arr, and an integer target,
 * return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.
 * As the answer can be very large, return it modulo 10^9 + 7.
 */
object Solution233SumWithMultiplicity {
    def threeSumMulti(arr: Array[Int], target: Int): Int = {
        val _MOD: Int = 1_000_000_007
        val count: Array[Long] = Array.fill(101)(0)
        arr.foreach(n => count(n) = count(n) + 1)
        // x != y != z
        val resA = (for (i <- 0 to 100;
                         j <- (i + 1) to 100
                         if j < (target - i - j) && (target - i - j) <= 100) yield
            count(i) * count(j) * count(target - i - j)).foldLeft(0L)((acc, cur) => (acc + cur) % _MOD)
        // x == y != z
        val resB = (for (i <- 0 to 100 if i < (target - 2 * i) && (target - 2 * i) <= 100) yield
            count(i) * (count(i) - 1) / 2 * count(target - 2 * i))
            .foldLeft(0L)((acc, cur) => (acc + cur) % _MOD)
        // x != y == z
        val resC = (for (i <- 0 to 100 if (target % 2 == i % 2) && i < ((target - i) / 2) && ((target - i) / 2) <= 100) yield
            count(i) * count((target - i) / 2) * (count((target - i) / 2) - 1) / 2)
            .foldLeft(0L)((acc, cur) => (acc + cur) % _MOD)
        // x == y == z
        val resD =
            if (target % 3 == 0 && 0 <= (target / 3) && (target / 3) <= 100)
                count(target / 3) * (count(target / 3) - 1) * (count(target / 3) - 2) / 6
            else
                0

        (resA % _MOD + resB % _MOD + resC % _MOD + resD % _MOD ).toInt
    }
}
