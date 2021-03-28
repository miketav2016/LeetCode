package marchLeetCodingChallenge2021.week4March

import marchLeetCodingChallenge2021.week4March.Solution28ReconstructOriginalDigitsFromEnglish.originalDigits
import org.scalatest.funsuite.AnyFunSuite

class Solution28ReconstructOriginalDigitsFromEnglishTest extends AnyFunSuite {

    test("testOriginalDigits0") {
        assert(originalDigits("owoztneoer") == "012")
    }
    test("testOriginalDigits1") {
        assert(originalDigits("fviefuro") == "45")
    }

}
