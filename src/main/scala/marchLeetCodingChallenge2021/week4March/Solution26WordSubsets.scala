package marchLeetCodingChallenge2021.week4March

object Solution26WordSubsets {
    def wordSubsets(a: Array[String], b: Array[String]): Array[String] = {
        def countSN(string: String): Array[Int] = {
            val res = Array.fill(26)(0)
            string.foreach(ch => {
                res(ch - 'a') += 1
            })
            res
        }
        val bСount: Array[Int] = countSN(b.reduce((s1, s2) => s1.concat(s2).diff(s1.intersect(s2))))
        a.foldLeft(Array[String]())((acc, word) => {
            val aCount = countSN(word)
            if ((for (i <- bСount.indices) yield bСount(i) <= aCount(i)).forall(_ == true))
                acc :+ word
            else
                acc
        })
    }
}
