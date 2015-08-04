package br.com.six2six.model.coordinate

import junit.framework.TestCase
import org.junit.Assert._
import org.junit.Test

class CoordinateTest {
  
  @Test
  def shouldComputeDistanceBetweenCoordinates {
    val wall = Wall(1,2)
    val reference = Ground(5,5)
    val distance = wall.distanceTo(reference)
    assertEquals(BigDecimal(5), distance)
  }
  
}