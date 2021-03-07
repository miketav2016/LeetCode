package marchLeetCodingChallenge2021.week1March1_7

import marchLeetCodingChallenge2021.week1March1_7.resourse.MyEntry

/**
 * Design a HashMap without using any built-in hash table libraries.
 *
 * To be specific, your design should include these functions:
 *
 * put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
 * get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
 */
class SolutionMyHashMap {

  /** Initialize your data structure here. */
  private var entries: Vector[MyEntry[Int, Int]] = Vector[MyEntry[Int, Int]]()

  /** value will always be non-negative. */
  def put(key: Int, value: Int): Unit = {
    remove(key)
    entries = entries :+ MyEntry(key, value)
  }

  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  def get(key: Int): Int = {
    val tmp = entries.filter { case MyEntry(k, _) => k == key }
    if (tmp.isEmpty)
      -1
    else
      tmp.head.value

  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  def remove(key: Int): Unit = {
    entries = entries.filterNot { case MyEntry(k, _) => k == key }
  }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = new MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */