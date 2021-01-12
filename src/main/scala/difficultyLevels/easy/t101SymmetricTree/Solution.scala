package difficultyLevels.easy.t101SymmetricTree

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 * var value: Int = _value
 * var left: TreeNode = _left
 * var right: TreeNode = _right
 * }
 */
object Solution extends App {
  def isSymmetric(root: TreeNode): Boolean = {
    def _isSymmetric(t: TreeNode): Boolean = {
      if (t == null) true
      else {
        isMirror(t.left, t.right)
      }
    }

    def isMirror(first: TreeNode, second: TreeNode): Boolean = {
      if (first == null && second == null) true
      else if (first == null && second != null) false
      else if (first != null && second == null) false
      else if (first.value != second.value) false
      else isMirror(first.left, second.right) && isMirror(first.right, second.left)
    }

    _isSymmetric(root)
}

val treeNode0 = new TreeNode (1, new TreeNode (2, new TreeNode (3), new TreeNode (4) ), new TreeNode (2, new TreeNode (3), new TreeNode (4) ) )
val treeNode1 = new TreeNode ()
val treeNode2 = new TreeNode (1, new TreeNode (2, new TreeNode (3) ), new TreeNode (2, new TreeNode (3) ) )
val res = isSymmetric (treeNode0)
println (res)
}
