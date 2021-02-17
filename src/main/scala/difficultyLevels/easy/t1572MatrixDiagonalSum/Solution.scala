package difficultyLevels.easy.t1572MatrixDiagonalSum

/**
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * Only include the sum of all the elements on the primary diagonal and
 * all the elements on the secondary diagonal that are not part of the primary diagonal.
 */
object Solution extends App {
  def diagonalSum(mat: Array[Array[Int]]): Int = {
    val lSize = mat(0).length - 1
    (for (i <- mat.indices) yield mat(i)(i) + (if (i != lSize - i) mat(i)(lSize - i) else 0)).sum
  }

  val mat = Array(Array(1, 2, 3),
    Array(4, 5, 6),
    Array(7, 8, 9))
  val res = diagonalSum(mat)
  println(res)
}
