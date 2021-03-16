package marchLeetCodingChallenge2021.week3March

import scala.annotation.tailrec
import scala.collection.mutable

class Solution15EncodeAndDecodeTinyURL {
  val chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
  val codeDB: mutable.HashMap[String, String] = scala.collection.mutable.HashMap[String, String]()
  val urlDB: mutable.HashMap[String, String] = scala.collection.mutable.HashMap[String, String]()

  def makeCode: String = {
    val tinyUrl = new StringBuilder()
    val rand = new scala.util.Random
    for (_ <- 0 to 6)
      tinyUrl += chars(rand.nextInt(61))
    "http://tinyurl.com/" + tinyUrl
  }

  // Encodes a URL to a shortened URL.
  def encode(longURL: String): String = {
    @tailrec
    def uniqCode: String = {
      makeCode match {
        case code if codeDB.contains(code) => uniqCode
        case code if !codeDB.contains(code) => code
      }
    }

    if (urlDB.contains(longURL))
      urlDB(longURL)
    val shortURL = uniqCode
    codeDB += shortURL -> longURL
    urlDB += longURL -> shortURL

    shortURL
  }

  // Decodes a shortened URL to its original URL.
  def decode(shortURL: String): String = {
    codeDB(shortURL)
  }
}
