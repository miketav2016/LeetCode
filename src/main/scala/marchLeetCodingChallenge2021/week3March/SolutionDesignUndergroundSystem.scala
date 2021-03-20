package marchLeetCodingChallenge2021.week3March

import scala.collection.mutable

/**
 * Implement the UndergroundSystem class:
 * void checkIn(int id, string stationName, int t)
 * A customer with a card id equal to id, gets in the station stationName at time t.
 * A customer can only be checked into one place at a time.
 * void checkOut(int id, string stationName, int t)
 * A customer with a card id equal to id, gets out from the station stationName at time t.
 * double getAverageTime(string startStation, string endStation)
 * Returns the average time to travel between the startStation and the endStation.
 * The average time is computed from all the previous traveling from startStation to endStation that happened directly.
 * Call to getAverageTime is always valid.
 * You can assume all calls to checkIn and checkOut methods are consistent.
 * If a customer gets in at time t1 at some station, they get out at time t2 with t2 > t1.
 * All events happen in chronological order.
 */
class SolutionDesignUndergroundSystem() {

  val mapInOutTime: mutable.Map[String, List[Int]] = collection.mutable.Map()
  val mapInTime: mutable.Map[Int, (String, Int)] = collection.mutable.Map()


  def checkIn(id: Int, stationName: String, t: Int): Unit = {
    if (!mapInTime.contains(id))
      mapInTime.put(id, (stationName, t))
  }

  def checkOut(id: Int, stationName: String, t: Int): Unit = {
    val date = mapInTime(id)
    mapInOutTime.put(date._1 + stationName, mapInOutTime.getOrElse(date._1 + stationName, List[Int]()) :+ (t - date._2))
    mapInTime.remove(id)
  }

  def getAverageTime(startStation: String, endStation: String): Double = {
    mapInOutTime(startStation + endStation).foldLeft((0, 0)) {
      case ((acc, size), time) => (acc + time, size + 1)
    } match {
      case (time, size) => time.toDouble / size
    }
  }
}
