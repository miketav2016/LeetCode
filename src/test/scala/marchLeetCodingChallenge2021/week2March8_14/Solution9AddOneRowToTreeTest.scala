package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.resourse.TreeNode
import marchLeetCodingChallenge2021.week2March8_14.Solution9AddOneRowToTree.addOneRow
import org.scalatest.funsuite.AnyFunSuite

class Solution9AddOneRowToTreeTest extends AnyFunSuite {
  /*
         4
       /   \
      2     6
     / \   /
    3   1 5
  */
  test("testAddOneRow0") {
    val tree = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), new TreeNode(6, new TreeNode(5)))
    val treeRes = new TreeNode(4,
      new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(1))),
      new TreeNode(1, new TreeNode(6, new TreeNode(5)))
    )
    val res = addOneRow(tree, 1, 2)
    //    assert(res === treeRes)
  }
  /*
       4
       /
      2
     / \
    3   1
   */
  test("testAddOneRow1") {
    val tree = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)))
    val treeRes = new TreeNode(4,
      new TreeNode(2,
        new TreeNode(1,new TreeNode(3)),
        new TreeNode(1, _right = new TreeNode(1))))

    val res = addOneRow(tree, 1, 3)
  }
  /*[4,2,6,3,1,5]
1
1*/
  test("testAddOneRow2") {
    val tree = new TreeNode(4,
      new TreeNode(2, new TreeNode(3), new TreeNode(1)),
      new TreeNode(6, new TreeNode(5))
    )
    val treeRes = new TreeNode(4,
      new TreeNode(2,
        new TreeNode(1,new TreeNode(3)),
        new TreeNode(1, _right = new TreeNode(1))))

    val res = addOneRow(tree, 1, 1)
  }


}
