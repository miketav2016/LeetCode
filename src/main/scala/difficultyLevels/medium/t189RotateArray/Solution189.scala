package difficultyLevels.medium.t189RotateArray

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
object Solution189 {
    def rotate(nums: Array[Int], k: Int): Array[Int] = {
        val div = if (nums.length > k) nums.length - k
        else nums.length - k % nums.length

        val (begin, end) = nums.splitAt(div)

        (end ++ begin).foldLeft[Int](0) {(r, i) =>
                nums(r) = i
                r + 1
        }

        nums
    }
}
