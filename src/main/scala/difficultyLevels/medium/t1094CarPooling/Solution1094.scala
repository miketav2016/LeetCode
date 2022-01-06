package difficultyLevels.medium.t1094CarPooling

/**
 * There is a car with capacity empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).
 *
 * You are given the integer capacity and an array trips where trip[i] = [numPassengersi, fromi, toi] indicates that the ith trip has numPassengersi passengers and the locations to pick them up and drop them off are fromi and toi respectively. The locations are given as the number of kilometers due east from the car's initial location.
 *
 * Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
 */
object Solution1094 {
    def carPooling(trips: Array[Array[Int]], capacity: Int): Boolean = {
        trips.sortBy(_ (1)).foldLeft(0, true, Map[Int, Int]()) { case ((currentCapacity, isPossible, landingMap), trip) =>
            val currentLanding = currentCapacity - landingMap.filter(_._1 <= trip(1)).values.sum + trip.head
            val landingMapUpdate = landingMap.filter(_._1 > trip(1)) + (trip(2) -> (trip(0) + landingMap.getOrElse(trip(2), 0)))
            if (currentLanding <= capacity) {
                (currentLanding, isPossible, landingMapUpdate)
            } else {
                (currentCapacity + trip.head, false, landingMapUpdate)
            }
        }._2
    }
}
