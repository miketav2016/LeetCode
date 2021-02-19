package difficultyLevels.easy.t832FlippingAnImage

/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 */
object Solution extends App {
  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
    A.foldLeft(Array[Array[Int]]())((acc, line) => acc :+ line.reverse.foldLeft(Array[Int]())((newLine, elm) => newLine :+ (if (elm == 1) 0 else 1)))
  }

  val a = Array(Array(1, 1, 0), Array(1, 0, 1), Array(0, 0, 0))
  val res = flipAndInvertImage(a)
  res.foreach(ar => println(ar.mkString(", ")))
}
