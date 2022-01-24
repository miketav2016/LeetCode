package difficultyLevels.easy.t520DetectCapital

/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 *
 * Given a string word, return true if the usage of capitals in it is right.
 */
object Solution520 {
    def detectCapitalUseV0(word: String): Boolean = {
        () match {
            case _ if word == word.toUpperCase => true
            case _ if word == word.toLowerCase => true
            case _ if word == word.toLowerCase.capitalize => true
            case _ => false
        }
    }

    def detectCapitalUse(word: String): Boolean = {
        word == word.toUpperCase || word == word.toLowerCase || word == word.toLowerCase.capitalize
    }
}
