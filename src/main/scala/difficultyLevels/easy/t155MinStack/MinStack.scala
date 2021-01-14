package difficultyLevels.easy.t155MinStack

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
class MinStack() {
  /** initialize your data structure here. */

  import scala.collection.mutable.ListBuffer

  val buff: ListBuffer[Int] = ListBuffer[Int]()

  def push(x: Int) = {
    buff += x
  }

  def pop(): Unit = {
    buff.remove(buff.length - 1)
  }

  def top(): Int = {
    buff.last
  }

  def getMin(): Int = {
    buff.min
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */