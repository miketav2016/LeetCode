package difficultyLevels.easy.t155MinStack

object Solution extends App {
 /* {
    val minStack = new MinStack
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    println(minStack.getMin) // return -3

    minStack.pop()
    println(minStack.top) // return 0

    println(minStack.getMin) // return -2
  }*/

  // [[],[1],[2],[],[],[],[],[]]
  val st = new MinStack()
  st.push(1)
  st.push(2)
  println(st.top)
  println(st.getMin)
  println(st.pop)
  println(st.getMin)
  println(st.top)

}
