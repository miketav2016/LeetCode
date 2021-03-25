package marchLeetCodingChallenge2021.week4March

/**
 * Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
 * the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.
 * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.
 * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
 * Note:
 * The order of returned grid coordinates does not matter.
 * Both m and n are less than 150.
 */
object SolutionPacificAtlanticWaterFlow {
    def pacificAtlantic(matrix: Array[Array[Int]]): List[List[Int]] = {
        def isTouchesPacific(i: Int, j: Int): Boolean = {
            (i, j) match {
                case _ if i == 0 || j == 0 => true
                case _ if matrix(i)(j) >= matrix(i - 1)(j) || matrix(i)(j) >= matrix(i)(j - 1) =>
                    isTouchesPacific(i - 1, j) || isTouchesPacific(i, j - 1)
                case _ => false

            }
        }

        def isTouchesAtlantic(i: Int, j: Int): Boolean = {
            (i, j) match {
                case _ if i == matrix.length - 1 || j == matrix(0).length - 1 => true
                case _ if matrix(i)(j) >= matrix(i + 1)(j) || matrix(i)(j) >= matrix(i)(j + 1) =>
                    isTouchesAtlantic(i + 1, j) || isTouchesAtlantic(i, j + 1)
                case _ => false

            }
        }

        def checkPoint(i: Int, j: Int): Boolean = {
            isTouchesPacific(i, j) && isTouchesAtlantic(i, j)
        }

        (for (i <- matrix.indices;
              j <- matrix(i).indices if checkPoint(i, j)) yield List(i, j)).toList

    }
}
