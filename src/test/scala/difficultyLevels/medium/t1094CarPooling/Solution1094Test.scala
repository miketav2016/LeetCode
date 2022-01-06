package difficultyLevels.medium.t1094CarPooling

import difficultyLevels.medium.t1094CarPooling.Solution1094.carPooling
import org.scalatest.funsuite.AnyFunSuite

class Solution1094Test extends AnyFunSuite {

    test("testCarPooling0") {
        val trips = Array(Array(2, 1, 5), Array(3, 3, 7))
        val capacity = 4
        assert(!carPooling(trips, capacity))
    }

    test("testCarPooling1") {
        val trips = Array(Array(2, 1, 5), Array(3, 3, 7))
        val capacity = 5
        assert(carPooling(trips, capacity))
    }

    test("testCarPooling2") {
        val trips = Array(Array(2, 1, 5), Array(3, 5, 7))
        val capacity = 3
        assert(carPooling(trips, capacity))
    }

    test("testCarPooling3") {
        val trips = Array(Array(3,2,8), Array(4,4,6), Array(10,8,9))
        val capacity = 11
        assert(carPooling(trips, capacity))
    }

    test("testCarPooling4") {
        val trips = Array(Array(7,5,6), Array(6,7,8), Array(10,1,6))
        val capacity = 16
        assert(!carPooling(trips, capacity))
    }

    test("testCarPooling5") {
        val trips = Array(Array(3,2,7), Array(3,7,9), Array(8,3,9))
        val capacity = 11
        assert(carPooling(trips, capacity))
    }

    test("testCarPooling6") {
        val trips = Array(Array(5,4,7), Array(7,4,8), Array(4,1,8))
        val capacity = 17
        assert(carPooling(trips, capacity))
    }
}
