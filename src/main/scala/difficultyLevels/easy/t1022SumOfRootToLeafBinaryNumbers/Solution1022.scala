package difficultyLevels.easy.t1022SumOfRootToLeafBinaryNumbers


//Definition for a binary tree node.
class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
}

/**
 * You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.
 *
 * For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.
 *
 * The test cases are generated so that the answer fits in a 32-bits integer.
 */
object Solution1022 {
    def sumRootToLeaf(root: TreeNode): Int = sumRootToLeaf(root, 0)

    def sumRootToLeaf(root: TreeNode, sum: Int): Int = {
        root match {
            case null => 0
            case _ if root.left == null && root.right == null => (2 * sum) + root.value
            case _ =>
                val newSum = (2 * sum) + root.value
                sumRootToLeaf(root.left, newSum) + sumRootToLeaf(root.right, newSum)
        }
    }
}
