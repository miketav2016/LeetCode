package difficultyLevels.easy.t160IntersectionOfTwoLinkedLists

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 */

object Solution extends App {
  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
    var nextA = headA
    while (nextA != null) {
      var pB = headB
      while (pB != null) {
        if (nextA == pB) return nextA
        pB = pB.next
      }
      nextA = nextA.next
    }
    null
  }

  val listA0 = new ListNode(4)
  val listA1 = new ListNode(1)
  val listA2 = new ListNode(8)
  val listA3 = new ListNode(4)
  val listA4 = new ListNode(5)
  listA0.next = listA1
  listA1.next = listA2
  listA2.next = listA3
  listA3.next = listA4
  val listB0 = new ListNode(5)
  val listB1 = new ListNode(6)
  val listB2 = new ListNode(1)
  val listB3 = new ListNode(8)
  val listB4 = new ListNode(4)
  val listB5 = new ListNode(5)
  listB0.next = listB1
  listB1.next = listA1
  /*listB1.next = listB2
  listB2.next = listB3
  listB3.next = listB4
  listB4.next = listB5
  */
  val res = getIntersectionNode(listA0, listB0)
  println(res)
}
