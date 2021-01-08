package difficultyLevels.easy.t108ConvertSortedArrayToBinarySearchTree

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 * var value: Int = _value
 * var left: TreeNode = _left
 * var right: TreeNode = _right
 * }
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 */
object Solution extends App {
  def sortedArrayToBSTM(nums: Array[Int]): TreeNode = {
    def makeTree(l: Int, r: Int): TreeNode = {
      if (l > r) null
      else {
        val mid = (l + r + 1) / 2
        val node = new TreeNode(nums(mid))
        node.left = makeTree(l, mid - 1)
        node.right = makeTree(mid + 1, r)
        node
      }
    }
    makeTree(0, nums.length - 1)
  }

  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    if (nums.isEmpty) return null

    val (a, b) = nums.splitAt(nums.length / 2)

    val res = new TreeNode(b.head)
    a.foldRight(res)((cur, acc) => {
      val tmp = new TreeNode(_value = cur)
      acc.left = tmp
      tmp
    }
    )
    b.tail.foldLeft(res)((acc, cur) => {
      val tmp = new TreeNode(_value = cur)
      acc.right = tmp
      tmp
    }
    )
    res
  }

  val array0 = Array(-10, -3, 0, 5, 9)
  val array1 = Array[Int]()
  val array2 = Array[Int](0, 1, 2, 3, 4, 5)
  val res = sortedArrayToBSTM(array0)
  println(res)

}