package marchLeetCodingChallenge2021.week4March

import scala.collection.immutable.HashMap

/**
 * Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.
 * For a given query word, the spell checker handles two categories of spelling mistakes:
 * Capitalization: If the query matches a word in the wordlist (case-insensitive),
 * then the query word is returned with the same case as the case in the wordlist.
 * Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel individually,
 * it matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the match in the wordlist.
 * In addition, the spell checker operates under the following precedence rules:
 * When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
 * When the query matches a word up to capitlization, you should return the first such match in the wordlist.
 * When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
 * If the query has no matches in the wordlist, you should return the empty string.
 * Given some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].
 */
object Solution22VowelSpellchecker {
  def spellchecker(wordlist: Array[String], queries: Array[String]): Array[String] = {

    def deVowel(word: String): String = {
      word.foldLeft(new String())((acc, cur) => acc + (if (isVowel(cur.toLower)) "*" else cur))
    }

    def isVowel(char: Char): Boolean = {
      char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'
    }

    val (words_perfect, words_cap, words_vow) = wordlist.foldLeft(Array[String](), HashMap[String, String](), HashMap[String, String]()) {
      case ((_words_perfect, _words_cap, _words_vow), word) => (_words_perfect.appended(word),
        _words_cap + (word.toLowerCase() -> _words_cap.getOrElse(word.toLowerCase(), word)),
        _words_vow + (deVowel(word).toLowerCase() -> _words_vow.getOrElse(deVowel(word).toLowerCase(), word))
      )
    }

    def solve(word: String): String = {
      word match {
        case _ if words_perfect.contains(word) => word
        case _ if words_cap.contains(word.toLowerCase) => words_cap(word.toLowerCase)
        case _ if words_vow.contains(deVowel(word).toLowerCase()) => words_vow(deVowel(word).toLowerCase())
        case _ => ""
      }
    }

    queries.foldLeft(Array[String]())((acc, cur) => acc :+ solve(cur))
  }
}
