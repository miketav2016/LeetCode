package difficultyLevels.easy.t290WordPattern


/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
object Solution290 {
    def wordPattern(pattern: String, s: String): Boolean = {
        val rawData = s
            .split(" ")
            .zip(pattern.toList)

        s.split(" ").length == pattern.toList.length &&
            rawData
                .foldLeft(Map[Char, List[String]]()) { case (acc, (s, c)) => acc + (c -> (acc.getOrElse(c, Nil) :+ s)) }
                .map(_._2.distinct.length)
                .count(_ > 1) == 0 &&
            rawData
                .foldLeft(Map[String, List[Char]]()) { case (acc, (s, c)) => acc + (s -> (acc.getOrElse(s, Nil) :+ c)) }
                .map(_._2.distinct.length)
                .count(_ > 1) == 0
    }
}
