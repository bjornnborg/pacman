package br.com.six2six.model.coordinate

class MazeParser {

  def parse(char: String, x: Int, y: Int): MazeItem = {
    if (char == "█") {
      return new Wall(x, y)
    } else if (char == "·") {
      return new Ground(x, y)
    } else if (char == "ϖ") {
      return new Food(x, y)
    }
    return null
  }
  
  def parseLine(chars: String, x: Int, y: Int): List[MazeItem] = {
    chars.toList.map(c => parse(c.toString, x, y))
  }
  
}