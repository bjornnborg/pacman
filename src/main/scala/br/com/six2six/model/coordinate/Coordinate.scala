package br.com.six2six.model.coordinate
import scala.math.pow
import scala.math.sqrt

trait Coordinate {
  def x: Int
  def y: Int
  
  def distanceTo(other: Coordinate): BigDecimal = {
    //raiz((xb-xa)^2 + (yb-ya)^2)
    BigDecimal(sqrt(pow((other.x - this.x), 2) + pow((other.y - this.y), 2)))
  }  
}