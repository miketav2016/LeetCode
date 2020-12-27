package difficultyLevels.easy.t1431KidsWithTheGreatestNumberOfCandies

/**
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
 * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 */

object Solution extends App {

  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val maxCandy = candies.max
    candies.foldLeft(Array[Boolean]())((acc, cur) => acc :+ ((cur + extraCandies) >= maxCandy))
  }

  val candies: Array[Int] = Array(2, 3, 5, 1, 3)
  val extraCandies = 3

 assert(kidsWithCandies(candies, extraCandies) sameElements Array(true, true, true, false, true))
 assert(kidsWithCandies(Array(12,1,12), 10) sameElements Array(true, false, true))
 assert(kidsWithCandies(Array( 4,2,1,1,2), 1) sameElements Array(true, false, false, false, false))
  println(kidsWithCandies(candies, extraCandies).mkString("Array(", ", ", ")"))

}
