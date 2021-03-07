package marchLeetCodingChallenge2021.week1March1_7

import org.scalatest.funsuite.AnyFunSuite

class SolutionMyHashMapTest extends AnyFunSuite {

  test("testMyHashMap1") {
    val hashMap = new SolutionMyHashMap()
    hashMap.put(1, 1)
    hashMap.put(2, 2)
    assert(hashMap.get(1) === 1) // returns 1
    assert(hashMap.get(3) === -1) // returns -1 (not found)
    hashMap.put(2, 1) // update the existing value
    assert(hashMap.get(2) === 1) // returns 1
    hashMap.remove(2) // remove the mapping for 2
    assert(hashMap.get(2) === -1) // returns -1 (not found)
  }
}
