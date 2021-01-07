package difficultyLevels.easy.t206ReverseLinkedList

/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 * var next: ListNode = _next
 * var x: Int = _x
 * }
 * Reverse a singly linked list.
 */
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
object Solution extends App {
  def reverseList(head: ListNode): ListNode = {
    if (head == null) return head
    var isEnd = false
    var listNode = List[Int]()
    var nextNode = head
    while (!isEnd && nextNode.next != null) {
      listNode = listNode :+ nextNode.x
      nextNode = nextNode.next
      if (nextNode.next == null) {
        isEnd = true
      }
    }
    listNode = listNode :+ nextNode.x
    listNode.tail.foldLeft(new ListNode(listNode.head))((acc, cur) =>
      new ListNode(cur, acc)
    )
  }

  def reverseList1(head: ListNode): ListNode = {
    def acc(head: ListNode): List[Int] = {
      head match {
        case _ if head.next != null => acc(head.next) :+ head.x
        case _ => List(head.x)
      }
    }

    val nums = acc(head).reverse
    nums.tail.foldLeft(new ListNode(nums.head))((acc, cur) =>
      new ListNode(cur,acc)
    )
  }

  def reverseList2(head: ListNode): ListNode = {
    def loop(head: ListNode, res: ListNode = null): ListNode = {
      head match {
        case null => res
        case h =>
          val c = h.next
          h.next = res
          loop(c,  h)
      }
    }
    loop(head)
  }

  val input0 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
  val input = new ListNode()
  val res = reverseList2(input0)
  println(res)
}
