package difficultyLevels.medium.t131PalindromePartitioning

import scala.collection.mutable

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
 *
 * A palindrome string is a string that reads the same backward as forward.
 */
object Solution131 {
    def partition(s: String): List[List[String]] = {
        val ans = mutable.ListBuffer[List[String]]()
        val tmpAns = mutable.ListBuffer[String]()

        def isPalindrome(str: String): Boolean = str.reverse == str

        def handler(str: String): Unit = str match {
            case _ if str.isEmpty => ans += tmpAns.toList
            case str =>
                for (k <- 0 until str.length) {
                    if (isPalindrome(str.substring(0, k + 1))) {
                        tmpAns += str.substring(0, k + 1)
                        handler(str.substring(k + 1))
                        tmpAns.remove(tmpAns.size - 1)
                    }
                }
        }

        handler(s)
        ans.toList.filter(x => x.nonEmpty)
    }
}
