package difficultyLevels.medium.t807MaxIncreaseToKeepCitySkyline

/**
 * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
 * We are allowed to increase the height of any number of buildings, by any amount
 * (the amounts can be different for different buildings). Height 0 is considered to be a building as well.
 * At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right,
 * must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed
 * by all the buildings when viewed from a distance. See the following example.
 * What is the maximum total sum that the height of the buildings can be increased?
 */
object Solution extends App {
  def maxIncreaseKeepingSkyline0(grid: Array[Array[Int]]): Int = {
    val maxLR = grid.map(_.max)
    val maxTD = grid.foldLeft(Array.fill[Int](grid.length)(0))((acc, elem) => acc.zip(elem).map { case (l, r) => l.max(r) })
    (for (line <- grid.indices) yield (for (elem <- grid(line).indices) yield {
      val max = maxLR(line).min(maxTD(elem))
      if (grid(line)(elem) >= max) 0 else max - grid(line)(elem)
    }).sum).sum
  }

  def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
    val maxLR = grid.map(_.max)
    val maxTD = grid.foldLeft(Array.fill[Int](grid.length)(0))((acc, elem) => acc.zip(elem).map { case (l, r) => l.max(r) })
    (for (line <- grid.indices) yield (for (elem <- grid(line).indices) yield {
      val max = maxLR(line).min(maxTD(elem))
      if (grid(line)(elem) >= max) 0 else max - grid(line)(elem)
    }).sum).sum
  }

  val grid = Array(Array(3, 0, 8, 4), Array(2, 4, 5, 7), Array(9, 2, 6, 3), Array(0, 3, 1, 0))
  val res = maxIncreaseKeepingSkyline(grid)
  println(res)
}
