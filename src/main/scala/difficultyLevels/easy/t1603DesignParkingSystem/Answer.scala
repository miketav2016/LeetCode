package difficultyLevels.easy.t1603DesignParkingSystem

object Answer extends App {
  val parkingSystem = new ParkingSystem(1, 1, 0)
  println(parkingSystem.addCar(1)) // return true because there is 1 available slot for a big car
  println(parkingSystem.addCar(2)) // return true because there is 1 available slot for a medium car
  println(parkingSystem.addCar(3)) // return false because there is no available slot for a small car
  println(parkingSystem.addCar(1)) // return false because there is no available slot for a big car. It is already occupied.
}
