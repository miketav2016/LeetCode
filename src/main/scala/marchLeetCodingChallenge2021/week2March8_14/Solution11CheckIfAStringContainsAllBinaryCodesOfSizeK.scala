package marchLeetCodingChallenge2021.week2March8_14

/**
 * Given a binary string s and an integer k.
 * Return True if every binary code of length k is a substring of s. Otherwise, return False.
 */
object Solution11CheckIfAStringContainsAllBinaryCodesOfSizeK {
  def hasAllCodes(s: String, k: Int): Boolean = {
    (0 until math.pow(2, k).toInt) map (_.toBinaryString) map (bin => "0" * (k - bin.length) + bin) forall s.contains
  }
}
