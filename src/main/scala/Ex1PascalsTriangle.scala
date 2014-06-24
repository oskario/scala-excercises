object Ex1PascalsTriangle {

  def pascal(row: Int, column: Int): Int = {
    if (row < 0 || column < 0 || column > row)
      throw new IllegalArgumentException("Invalid position")
    else if (column == 0 || row == 0 || column == row)
      1
    else
      pascal(row - 1, column - 1) + pascal(row - 1, column)
  }
}
