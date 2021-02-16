package difficultyLevels.easy.t804UniqueMorseCodeWords

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cab" can be written as "-.-..--...", (which is the concatenation "-.-." + ".-" + "-...").
 * We'll call such a concatenation, the transformation of a word.
 * Return the number of different transformations among all words we have.
 */
object Solution extends App {
  def uniqueMorseRepresentations(words: Array[String]): Int = {
    val morze = Array(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    words.foldLeft(Set[String]())((acc, word) => acc + word.flatMap(c => morze(c.toInt - 97))).size
  }

  val words = Array("gin", "zen", "gig", "msg")
  println(uniqueMorseRepresentations(words))
}
