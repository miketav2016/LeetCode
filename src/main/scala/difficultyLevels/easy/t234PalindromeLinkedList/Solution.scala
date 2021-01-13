package difficultyLevels.easy.t234PalindromeLinkedList

/**
 * Given a singly linked list, determine if it is a palindrome.
 * def go(head: ListNode, node: ListNode): ListNode = {
      if (node == null) head
      else {
        val ln = go(head, node.next)
        if (ln == null || ln.x != node.x) null
        else if (ln.next != null) {
          ln.next
        } else ln
      }
    }

    head == null || head.next == null || go(head, head) != null
 */
object Solution extends App {
  def isPalindrome(head: ListNode): Boolean = {
    def getX(head: ListNode): List[Int]= {
      if (head.next != null)
        getX(head.next) :+ head.x
      else
        List(head.x)
    }

    if (head != null) {
      val tmp = getX(head)
      tmp == tmp.reverse
    } else
      false

  }

  val listNode0 = new ListNode(1, new ListNode(2))
  val listNode1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))
  val listNode2 = new ListNode(-129, new ListNode(-129))
  val res = isPalindrome(listNode2)
  println(res)
}
