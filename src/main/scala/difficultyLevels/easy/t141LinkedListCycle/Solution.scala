package difficultyLevels.easy.t141LinkedListCycle

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached
 * again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
object Solution extends App {
  def hasCycle(head: ListNode): Boolean = {
    import scala.annotation.tailrec
    @tailrec
    def findCycle(head: ListNode, list: List[ListNode] = List[ListNode]()): Boolean = {
      head match {
        case _ if list.contains(head) => true
        case _ if head == null => false
        case _ =>  findCycle(head.next, list :+ head)
      }
    }

    findCycle(head)
  }
}
