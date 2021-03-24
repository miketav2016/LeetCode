package marchLeetCodingChallenge2021.week4March

object Solution24AdvantageShuffle {
    def advantageCount(A: Array[Int], B: Array[Int]): Array[Int] = {
        B.foldLeft(Array[Int](), scala.collection.mutable.ListBuffer(A: _*).sorted) { case ((res, data), cur) =>
            val n = data.find(_ > cur).getOrElse(data.find(_ <= cur).get)
            data.remove(data.indexOf(n))
            (res :+ n, data)
        }._1
    }
}
