package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.resourse.TreeNode

object Solution9AddOneRowToTree {
  def addOneRow(root: TreeNode, v: Int, d: Int): TreeNode = {

    def depthSearch(rootC: TreeNode, currentDepth: Int = 1): Unit = {
      currentDepth match {
        case dc if dc == d - 1 && rootC != null =>
          rootC.left = new TreeNode(v, _left = rootC.left)
          rootC.right = new TreeNode(v, _right = rootC.right)
        case _ if rootC == null => ()
        case _ =>
          depthSearch(rootC.left, currentDepth + 1)
          depthSearch(rootC.right, currentDepth + 1)
      }
    }

    val res = if (d == 1) {
      new TreeNode(v, root)
    } else {
      depthSearch(root)
      root
    }
    res
  }
}
