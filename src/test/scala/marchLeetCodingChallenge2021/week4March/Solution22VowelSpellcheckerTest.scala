package marchLeetCodingChallenge2021.week4March

import marchLeetCodingChallenge2021.week4March.Solution22VowelSpellchecker.spellchecker
import org.scalatest.funsuite.AnyFunSuite

class Solution22VowelSpellcheckerTest extends AnyFunSuite {

  test("testSpellchecker0") {
    val wordlist = Array("KiTe", "kite", "hare", "Hare")
    val queries = Array("kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto")
    val output = Array("kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe")
    assert(spellchecker(wordlist, queries) === output)
  }
  test("testSpellchecker1") {
    val wordlist = Array("KiTe", "kite", "hare", "Hare")
    val queries = Array("keti", "keet", "keto")
    val output = Array("KiTe", "", "KiTe")
    assert(spellchecker(wordlist, queries) === output)
  }
  test("testSpellchecker2") {
    val wordlist = Array("YellOw")
    val queries = Array("yollow")
    val output = Array("YellOw")
    assert(spellchecker(wordlist, queries) === output)
  }
}
