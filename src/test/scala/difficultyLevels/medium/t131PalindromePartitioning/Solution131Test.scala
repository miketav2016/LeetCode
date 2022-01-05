package difficultyLevels.medium.t131PalindromePartitioning

import difficultyLevels.medium.t131PalindromePartitioning.Solution131.partition
import org.scalatest.funsuite.AnyFunSuite


class Solution131Test extends AnyFunSuite {

    test("testPartition0") {
        val s = "aab"
        val output = List(List("a", "a", "b"), List("aa", "b"))
       assert(partition(s) == output)
    }

    test("testPartition1") {
        val s = "a"
        val output = List(List("a"))
       assert(partition(s) == output)
    }

}
