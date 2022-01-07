package difficultyLevels.medium.t382LinkedListRandomNode

import scala.annotation.tailrec
import scala.util.Random


class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
}

/**
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 *
 * Implement the Solution class:
 *
 * Solution(ListNode head) Initializes the object with the integer array nums.
 * int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be choosen.
 *
 * @param _head
 */
class Solution382(_head: ListNode) {

    @tailrec
    private def makeList(head: ListNode, list: List[Int] = Nil): List[Int] = {
        if (head.next != null)
            makeList(head.next, list :+ head.x)
        else
            list :+ head.x
    }

    val _list: List[Int] = makeList(_head)
    val random = new Random

    def getRandom: Int = {
        _list(random.nextInt(_list.length))
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = new Solution(head)
 * var param_1 = obj.getRandom()
 */