package marchLeetCodingChallenge2021.week1March1_7

import marchLeetCodingChallenge2021.resourse.TreeNode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Solution5AverageOfLevelsInBinaryTree {
  def averageOfLevels(root: TreeNode): Array[Double] = {
    if (root == null) Array[Double]()
    else {
      val arrayD = ArrayBuffer[Double]()
      val parent = mutable.Queue[TreeNode]()
      parent.append(root)
      while (parent.nonEmpty) {
        val children = mutable.Queue[TreeNode]().addAll(parent)
        parent.dequeueAll(_ => true)
        arrayD += children.foldLeft(.0)((acc, cur) => {
          if (cur.left != null) parent.append(cur.left)
          if (cur.right != null) parent.append(cur.right)
          acc + cur.value
        }) / children.size
      }
      arrayD.toArray
    }
  }
}
