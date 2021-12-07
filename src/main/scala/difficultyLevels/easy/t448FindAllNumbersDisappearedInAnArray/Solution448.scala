package difficultyLevels.easy.t448FindAllNumbersDisappearedInAnArray

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
object Solution448 {
    def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
//        nums.foldLeft(List[Int](), 1) { case ((acc, i), next) =>
//            (if (nums.contains(i)) acc else acc :+ i, i + 1)
//        }._1

        for (i <- nums.indices) {
            val value = Math.abs(nums(i))
            nums(value - 1) = -1 * Math.abs(nums(value - 1))
        }

        (for {
            i <- nums.indices
            if nums(i) > 0
        } yield i + 1).toList
    }
}