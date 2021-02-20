package difficultyLevels.medium.t94BinaryTreeInorderTraversal


/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
object Solution extends App {
  def inorderTraversal(root: TreeNode): List[Int] = {
    def inorderT(root: TreeNode): List[Int] = {
      if (root != null)
        inorderT(root.left) ::: List(root.value) ::: inorderT(root.right)
      else Nil
    }
    inorderT(root)
  }

  val root0 = new TreeNode(1, new TreeNode(), new TreeNode(2, new TreeNode(3)))
  val root = new TreeNode
  val res = inorderTraversal(root)
  println(res)
}
