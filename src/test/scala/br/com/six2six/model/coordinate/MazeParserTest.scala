package br.com.six2six.model.coordinate

import org.junit.Assert._

import org.junit.Test

class MazeParserTest {
  
  @Test
  def shouldParseWall() {
    val char = "█"
    val parser = new MazeParser
    val wall = parser.parse(char, 0, 0)
    assertNotNull(wall)
    var ok = false 
    wall match {
      case _: Wall => ok = true
    }
    assertTrue(ok)
  }
  
  @Test
  def shoudParseGround() {
    val char = "·"
    val parser = new MazeParser
    val ground = parser.parse(char, 0, 0)
    assertNotNull(ground)
    var ok = false 
    ground match {
      case _: Ground => ok = true
    }
    assertTrue(ok)
  }
  
  @Test
  def shoudParseFood() {
    val char = "ϖ"
    val parser = new MazeParser
    val food = parser.parse(char, 0, 0)
    assertNotNull(food)
    var ok = false 
    food match {
      case _: Food => ok = true
    }
    assertTrue(ok)
  }
  
  @Test
  def shoudParseLine() {
    val chars = "█ϖ·█··"
    val parser = new MazeParser
    val line = parser.parseLine(chars, 0, 0)
    assertNotNull(line)
    val result = line.groupBy(_.getClass.getSimpleName)
    assertEquals(2, result("Wall").size)
    assertEquals(1, result("Food").size)
    assertEquals(3, result("Ground").size)
  }  
}