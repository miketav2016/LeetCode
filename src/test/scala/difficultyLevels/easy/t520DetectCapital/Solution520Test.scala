package difficultyLevels.easy.t520DetectCapital

import difficultyLevels.easy.t520DetectCapital.Solution520.detectCapitalUse
import org.scalatest.funsuite.AnyFunSuite

class Solution520Test extends AnyFunSuite {

    test("testDetectCapitalUse0") {
        val word = "USA"
        assert(detectCapitalUse(word))
    }

    test("testDetectCapitalUse1") {
        val word = "FlaG"
        assert(!detectCapitalUse(word))
    }

}
