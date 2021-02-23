package difficultyLevels.medium.t1476SubrectangleQueries

/**
 * Implement the class SubrectangleQueries which receives a rows x cols rectangle as a matrix of integers in the constructor and supports two methods:
 * 1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
 * Updates all values with newValue in the subrectangle whose upper left coordinate is (row1,col1) and bottom right coordinate is (row2,col2).
 * 2. getValue(int row, int col)
 * Returns the current value of the coordinate (row,col) from the rectangle.
 */
class SubrectangleQueries(_rectangle: Array[Array[Int]]) {
  private var rectangle = _rectangle

  def updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int): Unit = {
    rectangle = (for (i <- rectangle.indices)
      yield (for (j <- rectangle(i).indices)
        yield if (i >= row1 && i <= row2 && j >= col1 && j <= col2) newValue else rectangle(i)(j)).toArray).toArray
  }

  def getValue(row: Int, col: Int): Int = {
    rectangle(row)(col)
  }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * var obj = new SubrectangleQueries(rectangle)
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue)
 * var param_2 = obj.getValue(row,col)
 */