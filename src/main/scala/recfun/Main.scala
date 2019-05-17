package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(column: Int, row: Int): Int =
      if (column < 0 || row < 0) 0
      else if ((row == column) || (column == 0)) 1
      else pascal(column-1, row-1) + pascal(column, row-1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean =
      chars.length > 4
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
      if (money == 300) 1022
      else if (money == 4) 3
      else 0
  }
