package difficultyLevels.easy.t21MergeTwoSortedLists

/**
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 */
object solution extends App {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    (l1, l2) match {
      case (null, null) => l1
      case (b, _) if b == null => l2
      case (_, a) if a == null => l1
      case _ if l1.x < l2.x => new ListNode(l1.x, mergeTwoLists(l1.next, l2))
      case _ if l1.x >= l2.x => new ListNode(l2.x, mergeTwoLists(l1, l2.next))
    }
  }

  val l11 = new ListNode(1, new ListNode(2, new ListNode(4)))
  val l22 = new ListNode(1, new ListNode(3, new ListNode(4)))
  val res0 = mergeTwoLists(l11,l22)
  println(res0)
  val res = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))
}
