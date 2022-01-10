package difficultyLevels.easy.t67AddBinary

import difficultyLevels.easy.t67AddBinary.Solution67.addBinary
import org.scalatest.funsuite.AnyFunSuite

class Solution67Test extends AnyFunSuite {

    test("testAddBinary0") {
        val a = "11"
        val b = "1"
        assert(addBinary(a, b) == "100")
    }

    test("testAddBinary1") {
        val a = "1010"
        val b = "1011"
        assert(addBinary(a, b) == "10101")
    }

}
