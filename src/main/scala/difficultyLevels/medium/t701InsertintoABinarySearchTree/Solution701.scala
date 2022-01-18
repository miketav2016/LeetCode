package difficultyLevels.medium.t701InsertintoABinarySearchTree



// Definition for a binary tree node.
class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
       var value: Int = _value
       var left: TreeNode = _left
       var right: TreeNode = _right
     }

class Solution701 {
    def insertIntoBST(root: TreeNode, `val`: Int): TreeNode = {

        if (root == null) return new TreeNode(`val`)
        if (`val` > root.value)
            root.right = insertIntoBST(root.right, `val`) // Continue searching in the right subtree
        else
            root.left = insertIntoBST(root.left, `val`) // Continue searching in the left subtree
        root
    }
}
