package marchLeetCodingChallenge2021.week5March

import marchLeetCodingChallenge2021.resourse.TreeNode

/**
 * You are given the root of a binary tree with n nodes, where each node is uniquely assigned a value from 1 to n.
 * You are also given a sequence of n values voyage, which is the desired pre-order traversal of the binary tree.
 * Any node in the binary tree can be flipped by swapping its left and right subtrees. For example, flipping node 1 will have the following effect:
 * Flip the smallest number of nodes so that the pre-order traversal of the tree matches voyage.
 * Return a list of the values of all flipped nodes. You may return the answer in any order.
 * If it is impossible to flip the nodes in the tree to make the pre-order traversal match voyage, return the list [-1].
 */
object Solution29FlipTreeToMatchPreorderTraversal {
    def flipMatchVoyage(root: TreeNode, voyage: Array[Int]): List[Int] = {
        var i = 0
        def recur(root: TreeNode, res: List[Int]): List[Int] = {
            if (root == null) {
                res
            } else if (root.value != voyage(i)) {
                List(-1)
            } else if (root.left != null && root.left.value != voyage(i + 1)) {
                i += 1
                res ++: List(root.value) ++: recur(root.right, res) ++: recur(root.left, res)
            } else {
                i += 1
                res ++: recur(root.left, res) ++: recur(root.right, res)
            }
        }
        val res = recur(root, List())
        if (res.contains(-1)) List(-1) else res
    }
}
