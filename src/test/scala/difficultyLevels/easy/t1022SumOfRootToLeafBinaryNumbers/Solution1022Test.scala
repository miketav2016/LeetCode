package difficultyLevels.easy.t1022SumOfRootToLeafBinaryNumbers

import difficultyLevels.easy.t1022SumOfRootToLeafBinaryNumbers.Solution1022.sumRootToLeaf
import org.scalatest.funsuite.AnyFunSuite

class Solution1022Test extends AnyFunSuite {

    test("testSumRootToLeaf0") {
        assert( sumRootToLeaf(new TreeNode()) == 0 )
    }

}
