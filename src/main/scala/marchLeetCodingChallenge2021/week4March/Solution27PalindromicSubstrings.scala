package marchLeetCodingChallenge2021.week4March

import scala.annotation.tailrec

/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 * The input string length won't exceed 1000.
 */
object Solution27PalindromicSubstrings {
    def countSubstrings(s: String): Int = {
        (for (i <- 0 until s.length) yield countPalindromesAroundCenter(s, i, i) + countPalindromesAroundCenter(s, i, i + 1)).sum
    }

    def countPalindromesAroundCenter(ss: String, lo: Int, hi: Int): Int = {
        @tailrec
        def handler(lo: Int, hi: Int, ans: Int = 0): Int = {
            if (lo >= 0 && hi < ss.length) {
                if (ss.charAt(lo) != ss.charAt(hi)) {
                    ans
                } else {
                    handler(lo - 1, hi + 1, ans + 1)
                }
            } else
                ans
        }

        handler(lo, hi)
    }
}