package difficultyLevels.medium.t24principleOfRecursion

/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 * var next: ListNode = _next
 * var x: Int = _x
 * }
 */

object SwapNodesInPairs extends App {
  def swapPairs(head: ListNode): ListNode = {
    if (head == null) head
    else if (head.next != null) {
      new ListNode(head.next.x, new ListNode(head.x, if (head.next.next != null) swapPairs(head.next.next) else null))
    }
    else {
      head
    }
  }

  val head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))
  val res = swapPairs(head)
  println(res)

}
