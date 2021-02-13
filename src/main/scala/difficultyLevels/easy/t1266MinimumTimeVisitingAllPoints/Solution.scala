package difficultyLevels.easy.t1266MinimumTimeVisitingAllPoints

import scala.annotation.tailrec

/**
 * On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi].
 * Return the minimum time in seconds to visit all the points in the order given by points.
 * You can move according to these rules:
 * In 1 second, you can either:
 * move vertically by one unit,
 * move horizontally by one unit, or
 * move diagonally sqrt(2) units (in other words, move one unit vertically then one unit horizontally in 1 second).
 * You have to visit the points in the same order as they appear in the array.
 * You are allowed to pass through points that appear later in the order, but these do not count as visits.
 */
object Solution extends App {
  def minTimeToVisitAllPoints(points: Array[Array[Int]]): Int = {
  def distance(p1: Array[Int], p2: Array[Int]): Double = math.abs(p2(0) - p1(0)) max math.abs(p2(1) - p1(1))
    points.tail.foldLeft(.0, points.head) { case ((acc, prev), cur) =>
      (acc + distance(prev, cur), cur)
    }._1.toInt
  }

  @tailrec
  def dist2Point(a: Array[Int], b: Array[Int], dist: Int = 0): Int = {
    if (a.sameElements(b))
      dist
    else {
      dist2Point(Seq(
        (distanceD(Array(a(0) - 1, a(1) - 1), b), Array(a(0) - 1, a(1) - 1)),
        (distanceD(Array(a(0) - 1, a(1)), b), Array(a(0) - 1, a(1))),
        (distanceD(Array(a(0) - 1, a(1) + 1), b), Array(a(0) - 1, a(1) + 1)),
        (distanceD(Array(a(0), a(1) - 1), b), Array(a(0), a(1) - 1)),
        (distanceD(Array(a(0), a(1) + 1), b), Array(a(0), a(1) + 1)),
        (distanceD(Array(a(0) + 1, a(1) - 1), b), Array(a(0) + 1, a(1) - 1)),
        (distanceD(Array(a(0) + 1, a(1)), b), Array(a(0) + 1, a(1))),
        (distanceD(Array(a(0) + 1, a(1) + 1), b), Array(a(0) + 1, a(1) + 1)),
      ).minBy(_._1)._2, b, dist + 1)
    }
  }

  def distanceD(a: Array[Int], b: Array[Int]): Double = math.hypot(a(0) - b(0), a(1) - b(1))

  val points = Array(Array(1, 1), Array(3, 4), Array(-1, 0))
  println(minTimeToVisitAllPoints(points))
//    println(distance(Array(1, 1), Array(3, 4)))
//    println(distance(Array(1, 1), Array(3, 4)))
}
