import Bearing.Bearing

object Bearing extends Enumeration {
  type Bearing = Value
  val North = Value(0)
  val East = Value(1)
  val South = Value(2)
  val West = Value(3)
}


case class Robot(val bearing: Bearing, val coordinates: (Int, Int)) {

  def turnRight(): Robot = {
    Robot(Bearing(Math.floorMod((bearing.id + 1), 4)), coordinates)
  }

  def turnLeft(): Robot = {
    Robot(Bearing(Math.floorMod((bearing.id - 1), 4)), coordinates)
  }

  def advance(): Robot = {
    Robot(bearing, bearing match {
      case Bearing.North => (coordinates._1, coordinates._2 + 1)
      case Bearing.East => (coordinates._1 + 1, coordinates._2)
      case Bearing.South => (coordinates._1, coordinates._2 - 1)
      case Bearing.West => (coordinates._1 - 1, coordinates._2)
    })
  }

  def simulate(inst: String): Robot = {
    inst.foldLeft(this)((robot, c) => {
      c match {
        case 'A' => robot.advance()
        case 'R' => robot.turnRight()
        case 'L' => robot.turnLeft()
      }
    })

  }
}
