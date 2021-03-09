package marchLeetCodingChallenge2021.week1March1_7

import marchLeetCodingChallenge2021.week1March1_7.Solution5AverageOfLevelsInBinaryTree.averageOfLevels
import marchLeetCodingChallenge2021.resourse.TreeNode
import org.scalatest.funsuite.AnyFunSuite

class Solution5AverageOfLevelsInBinaryTreeTest extends AnyFunSuite {

  test("testAverageOfLevels") {
    val tree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))
    val res = averageOfLevels(tree)
    assert(res === Array(3, 14.5, 11))
  }

}
