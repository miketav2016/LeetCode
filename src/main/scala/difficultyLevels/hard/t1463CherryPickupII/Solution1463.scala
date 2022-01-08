package difficultyLevels.hard.t1463CherryPickupII

/**
 * You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.
 *
 * You have two robots that can collect cherries for you:
 *
 * Robot #1 is located at the top-left corner (0, 0), and
 *
 * Robot #2 is located at the top-right corner (0, cols - 1).
 *
 * Return the maximum number of cherries collection using both robots by following the rules below:
 *
 * From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
 *
 * When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
 *
 * When both robots stay in the same cell, only one takes the cherries.
 *
 * Both robots cannot move outside of the grid at any moment
 *
 * Both robots should reach the bottom row in grid.
 */
object Solution1463 {
    def cherryPickup(grid: Array[Array[Int]]): Int = {
        val m = grid.length
        val n = grid(0).length
        // initial all elements to -1 to mark unseen
        val dpCache = Array.fill(m, n, n)(-1)
        dp(0, 0, n - 1, grid, dpCache)
    }

    private def dp(row: Int,
                   col1: Int,
                   col2: Int,
                   grid: Array[Array[Int]],
                   dpCache: Array[Array[Array[Int]]]): Int = {
        def findMax: Int = (for (newCol1 <- col1 - 1 to col1 + 1;
                                 newCol2 <- col2 - 1 to col2 + 1)
        yield dp(row + 1, newCol1, newCol2, grid, dpCache)).max

        () match {
            case _ if col1 < 0 || col1 >= grid(0).length || col2 < 0 || col2 >= grid(0).length => 0
            // check cache
            case _ if dpCache(row)(col1)(col2) != -1 => dpCache(row)(col1)(col2)
            // current cell
            case _ =>
                val increment = col1 match {
                    case _ if col1 != col2 && row != grid.length - 1 => grid(row)(col2) + findMax
                    case _ if col1 != col2 => grid(row)(col2)
                    // transition
                    case _ if row != grid.length - 1 => findMax
                    case _ => 0
                }
                val result = increment + grid(row)(col1)
                dpCache(row)(col1)(col2) = result
                result
                //  short and readable,  but need var result
                //                var result = grid(row)(col1)
                //                if (col1 != col2) result += grid(row)(col2)
                //                // transition
                //                if (row != grid.length - 1) {
                //                    result += (for (newCol1 <- col1 - 1 to col1 + 1;
                //                                    newCol2 <- col2 - 1 to col2 + 1)
                //                    yield dp(row + 1, newCol1, newCol2, grid, dpCache)).max
                //                }
        }
    }

    // adapted java v0.1
    private def dp0(row: Int, col1: Int, col2: Int, grid: Array[Array[Int]], dpCache: Array[Array[Array[Int]]]): Int = {
        if (col1 < 0 || col1 >= grid(0).length || col2 < 0 || col2 >= grid(0).length) return 0
        // check cache
        if (dpCache(row)(col1)(col2) != -1) return dpCache(row)(col1)(col2)
        // current cell
        var result = 0
        result += grid(row)(col1)
        if (col1 != col2) result += grid(row)(col2)
        // transition
        if (row != grid.length - 1) {
            var max = 0
            for (newCol1 <- col1 - 1 to col1 + 1) {
                for (newCol2 <- col2 - 1 to col2 + 1) {
                    max = Math.max(max, dp(row + 1, newCol1, newCol2, grid, dpCache))
                }
            }
            result += max
        }
        dpCache(row)(col1)(col2) = result
        result
    }
}
