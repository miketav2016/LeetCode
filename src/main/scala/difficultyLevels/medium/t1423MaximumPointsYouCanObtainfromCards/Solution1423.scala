package difficultyLevels.medium.t1423MaximumPointsYouCanObtainfromCards



import scala.annotation.tailrec

object Solution1423 {
    def maxScore(cardPoints: Array[Int], k: Int): Int = {
        val left = cardPoints.scanLeft(0)(_ + _).take(k + 1)
        val right = cardPoints.scanRight(0)(_ + _).takeRight(k + 1)
        val zip2 = left zip right
        val zip2Map= zip2.map(n => n._1 + n._2)

        println(left.mkString("Array(", ", ", ")"))
        println(right.mkString("Array(", ", ", ")"))
        println(zip2.mkString("Array(", ", ", ")"))
        println(zip2Map.mkString("Array(", ", ", ")"))

        zip2Map.max
    }


    def maxScoreV1(cardPoints: Array[Int], k: Int): Int = {
        if(cardPoints.length == k) cardPoints.sum
        else searchMaxScore(cardPoints, k)
    }

    @tailrec
    private def searchMaxScore(cardPoints: Array[Int], k: Int, res: Int = 0): Int = {
        if (k > 0) {
            val start = cardPoints.headOption.getOrElse(0)
            val end = cardPoints.last
            val cutCardPoints = if (cardPoints.length > 1) cardPoints.dropRight(1).tail else cardPoints
            if (start > end)
                searchMaxScore(cutCardPoints, k - 1, res + start)
            else
                searchMaxScore(cutCardPoints, k - 1, res + end)
        } else res
    }
}