package difficultyLevels.easy.t35SearchInsertPosition

object Solution35 extends App {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        nums.search(target).insertionPoint
    }
}
