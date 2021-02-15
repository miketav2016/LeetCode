package difficultyLevels.easy.t1252CellsWithOddValuesInAMatrix

/**
 * Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices
 * where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.
 * Return the number of cells with odd values in the matrix after applying the increment to all indices.
 */
object Solution extends App {
  def oddCells(n: Int, m: Int, indices: Array[Array[Int]]): Int = {
   indices.foldLeft(IndexedSeq.fill(n)(IndexedSeq.fill(m)(0))) { (acc, cur) =>
    (for (i <- acc.indices) yield
        if (i == cur(0))
          acc(i).map(_ + 1)
        else acc(i)).map(line =>
     for (i <- line.indices) yield {
          if (i == cur(1))
            line(i)+ 1
          else
            line(i)
        }
      )
    }.foldLeft(0)((acc, line) => acc + line.count(_ % 2 == 1))
  }

  val n = 2
  val m = 3
  val indices = Array(Array(0, 1), Array(1, 1))
  val res = oddCells(n, m, indices)
  println(res)
}
