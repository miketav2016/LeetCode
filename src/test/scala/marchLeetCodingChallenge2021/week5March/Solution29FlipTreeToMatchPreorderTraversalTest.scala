package marchLeetCodingChallenge2021.week5March

import marchLeetCodingChallenge2021.resourse.TreeNode
import marchLeetCodingChallenge2021.week5March.Solution29FlipTreeToMatchPreorderTraversal.flipMatchVoyage
import org.scalatest.funsuite.AnyFunSuite

class Solution29FlipTreeToMatchPreorderTraversalTest extends AnyFunSuite {

    test("testFlipMatchVoyage0") {
        val root = new TreeNode(1, new TreeNode(2))
        val voyage = Array(2, 1)
        assert(flipMatchVoyage(root, voyage) == List(-1))
    }
    test("testFlipMatchVoyage1") {
        val root = new TreeNode(1, new TreeNode(2), new TreeNode(3))
        val voyage = Array(1, 3, 2)
        assert(flipMatchVoyage(root, voyage) == List(1))
    }
    test("testFlipMatchVoyage2") {
        val root = new TreeNode(1, new TreeNode(2), new TreeNode(3))
        val voyage = Array(1, 2, 3)
        assert(flipMatchVoyage(root, voyage) == Nil)
    }

}
