package difficultyLevels.easy.t237DeleteNodeInALinkedList

/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 * var next: ListNode = null
 * var x: Int = _x
 * }
 * Write a function to delete a node in a singly-linked list.
 * You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 */
object Solution extends App {
  def deleteNode(node: ListNode): Unit = {
    node.x = node.next.x
    node.next = node.next.next
  }
}