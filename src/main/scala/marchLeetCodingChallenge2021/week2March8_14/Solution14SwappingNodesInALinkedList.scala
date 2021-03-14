package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.resourse.ListNode

import scala.annotation.tailrec

/**
 * You are given the head of a linked list, and an integer k.
 * Return the head of the linked list after swapping the values
 * of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
 */
object Solution14SwappingNodesInALinkedList {
  def swapNodes0(head: ListNode, k: Int): ListNode = {
    @tailrec
    def listNodeToArray(head: ListNode, array: Array[Int] = Array()): Array[Int] = {
      head match {
        case node if node.next != null => listNodeToArray(head.next, array :+ head.x)
        case _ => array :+ head.x
      }
    }

    def arrayToListNode(array: Array[Int]) = {
      @tailrec
      def handler(arr: Array[Int], listNode: ListNode): Unit = {
        arr match {
          case Array(a, _, _*) =>
            listNode.x = a
            listNode.next = new ListNode()
            handler(arr.tail, listNode.next)
          case tail => listNode.x = tail.head
        }
      }

      val listNode = new ListNode()
      handler(array, listNode)
      listNode
    }

    val array = listNodeToArray(head)
    arrayToListNode(array.foldLeft(Array[Int](), 1) { case ((acc, id), num) => (id match {
      case _ if id == k => acc :+ array(array.length - k)
      case _ if id == (array.length + 1 - k) => acc :+ array(k - 1)
      case _ => acc :+ num
    }, id + 1)
    }._1)
  }

  def swapNodes(head: ListNode, k: Int): ListNode = {
    val kNode = (1 until k).foldLeft(head)((acc, _) => acc.next)

    @tailrec
    def findEndK(head0: ListNode, head1: ListNode): ListNode = {
      head0 match {
        case null => head1
        case _ => findEndK(head0.next, head1.next)
      }
    }

    val endKNode = findEndK(kNode.next, head)

    val tmpVal = kNode.x
    kNode.x = endKNode.x
    endKNode.x = tmpVal
    head
  }
}
