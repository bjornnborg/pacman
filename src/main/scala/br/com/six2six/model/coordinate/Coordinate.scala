package br.com.six2six.model.coordinate
import scala.math.pow
import scala.math.sqrt

sealed trait Coordinate {
  def x: Int
  def y: Int
}

sealed abstract class MapItem extends Coordinate {
  def distanceTo(other: Coordinate): BigDecimal = {
    //raiz((xb-xa)^2 + (yb-ya)^2)
    BigDecimal(sqrt(pow((other.x - this.x), 2) + pow((other.y - this.y), 2)))
  }
}
case class Wall(x: Int, y: Int) extends MapItem
case class Ground(x: Int, y: Int) extends MapItem