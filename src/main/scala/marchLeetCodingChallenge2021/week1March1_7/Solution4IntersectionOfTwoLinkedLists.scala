package marchLeetCodingChallenge2021.week1March1_7

import difficultyLevels.easy.t160IntersectionOfTwoLinkedLists.ListNode


/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 */
object Solution4IntersectionOfTwoLinkedLists {
  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
    import scala.annotation.tailrec
    @tailrec
    def findIntersect(headA: ListNode, headB: ListNode = headB): ListNode = {
      headB match {
        case _ if headB == headA => headA
        case _ if headB == null => findIntersect(headA.next)
        case _ if headA == null => null
        case _ => findIntersect(headA, headB.next)
      }
    }

    findIntersect(headA)
  }
}
