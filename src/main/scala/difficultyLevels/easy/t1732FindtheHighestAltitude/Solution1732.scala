package difficultyLevels.easy.t1732FindtheHighestAltitude

/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1
 * for all (0 <= i < n). Return the highest altitude of a point.
 */
object Solution1732 {
  def largestAltitude(gain: Array[Int]): Int = {
    gain.foldLeft((0, 0)) { case ((prevAltitude, maxAltitude), shiftAltitude) => val currentAltitude = prevAltitude + shiftAltitude
      if (currentAltitude > maxAltitude)
        (currentAltitude, currentAltitude)
      else
        (currentAltitude, maxAltitude)
    }._2
  }
}
