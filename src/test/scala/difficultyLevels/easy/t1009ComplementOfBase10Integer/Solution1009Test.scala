package difficultyLevels.easy.t1009ComplementOfBase10Integer

import difficultyLevels.easy.t1009ComplementOfBase10Integer.Solution1009.bitwiseComplement
import org.scalatest.funsuite.AnyFunSuite

class Solution1009Test extends AnyFunSuite {

    test("testBitwiseComplement0") {
        assert(bitwiseComplement(5) == 2)
    }

    test("testBitwiseComplement1") {
        assert(bitwiseComplement(7) == 0)
    }

    test("testBitwiseComplement2") {
        assert(bitwiseComplement(10) == 5)
    }

    test("testBitwiseComplement3") {
        assert(bitwiseComplement(5) == 2)
    }

}
