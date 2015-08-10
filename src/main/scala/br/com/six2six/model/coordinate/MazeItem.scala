package br.com.six2six.model.coordinate

abstract class MazeItem extends Coordinate {
  
}

case class Wall(x: Int, y: Int) extends MazeItem
case class Ground(x: Int, y: Int) extends MazeItem
case class Food(x: Int, y: Int) extends MazeItem