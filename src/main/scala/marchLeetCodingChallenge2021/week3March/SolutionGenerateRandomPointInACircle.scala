package marchLeetCodingChallenge2021.week3March

import scala.annotation.tailrec
import scala.util.Random

/**
 * Given the radius and x-y positions of the center of a circle, write a function randPoint which generates a uniform random point in the circle.
 * Note:
 * input and output values are in floating-point.
 * radius and x-y position of the center of the circle is passed into the class constructor.
 * a point on the circumference of the circle is considered to be in the circle.
 * randPoint returns a size 2 array containing x-position and y-position of the random point, in that order.
 */
class SolutionGenerateRandomPointInACircle(_radius: Double, _x_center: Double, _y_center: Double) {
  // (x – a)^2 + (y – b)^2 = R^2
  def randPoint0(): Array[Double] = {
    val r = new Random()

    def getXoY(_center: Double) = {
      val _Min = _center - _radius
      val _Max = _center + _radius
      r.between(_Min, _Max)
    }

    @tailrec
    def point(): Array[Double] = {
      val rX = getXoY(_x_center)
      val rY = getXoY(_y_center)
      if (rX * rX + rY * rY <= _radius * _radius)
        Array(rX,rY)
      else
        point()
    }
    point()
  }

  def randPoint1(): Array[Double] = {
    val r = new Random()
    val _MinX = _x_center - _radius
    val _MaxX = _x_center + _radius
    val randomX = r.between(_MinX, _MaxX)
    val randomY = math.sqrt(math.pow(_radius, 2) - math.pow(randomX - _x_center, 2)) + _y_center
    Array(randomX, randomY)
  }
  def randPoint(): Array[Double] = {
    val ang = Math.random() * 2 * Math.PI
    val hyp = Math.sqrt(Math.random()) * _radius
    val adj = Math.cos(ang) * hyp
    val opp = Math.sin(ang) * hyp
    Array(_x_center + adj, _y_center + opp)
  }


}