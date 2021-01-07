package difficultyLevels.easy.t104MaximumDepthOfBinaryTree

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 * var value: Int = _value
 * var left: TreeNode = _left
 * var right: TreeNode = _right
 * }
 */

/**
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */


object Solution extends App {
  def maxDepth(root: TreeNode): Int = {
    if (root == null)
      0
    else
      1 + maxDepth(root.left).max(maxDepth(root.right))
  }

  val root0 = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(7)))
  val root1 = new TreeNode()
  val root2 = new TreeNode(0)
  val res = maxDepth(root1)
  println(res)
}