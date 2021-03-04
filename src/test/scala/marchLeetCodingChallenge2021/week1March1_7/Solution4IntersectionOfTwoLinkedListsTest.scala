package marchLeetCodingChallenge2021.week1March1_7

import difficultyLevels.easy.t160IntersectionOfTwoLinkedLists.ListNode
import marchLeetCodingChallenge2021.week1March1_7.Solution4IntersectionOfTwoLinkedLists.getIntersectionNode
import org.scalatest.funsuite.AnyFunSuite


class Solution4IntersectionOfTwoLinkedListsTest extends AnyFunSuite {

  test("testGetIntersectionNode1") {
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
    listB0.next = listB1
    listB1.next = listA1
    val res = getIntersectionNode(listA0, listB0)
    val control = listA1
    assert(res === control)
  }
}
