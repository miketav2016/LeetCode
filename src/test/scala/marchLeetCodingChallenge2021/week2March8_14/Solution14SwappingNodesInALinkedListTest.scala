package marchLeetCodingChallenge2021.week2March8_14

import marchLeetCodingChallenge2021.resourse.ListNode
import marchLeetCodingChallenge2021.week2March8_14.Solution14SwappingNodesInALinkedList.swapNodes
import org.scalatest.funsuite.AnyFunSuite

import scala.annotation.tailrec

class Solution14SwappingNodesInALinkedListTest extends AnyFunSuite {

  test("testSwapNodes0") {
    val head = Array(1, 2, 3, 4, 5)
    val k = 2
    val res = swapNodes(arrayToListNode(head), k)
    assert(listNodeToArray(res) === Array(1, 4, 3, 2, 5))
  }
  test("testSwapNodes1") {
    val head = Array(7, 9, 6, 6, 7, 8, 3, 0, 9, 5)
    val k = 5
    val res = listNodeToArray(swapNodes(arrayToListNode(head), k))
    assert(res === Array(7, 9, 6, 6, 8, 7, 3, 0, 9, 5))
  }

  def arrayToListNode(array: Array[Int]): ListNode = {
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

  def listNodeToArray(head: ListNode, array: Array[Int] = Array()): Array[Int] = {
    head match {
      case node if node.next != null => listNodeToArray(head.next, array :+ head.x)
      case _ => array :+ head.x
    }
  }
}
