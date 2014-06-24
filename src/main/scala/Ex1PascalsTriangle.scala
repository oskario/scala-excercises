object Ex1PascalsTriangle {

  /**
   * Calculates value of the field at the given spot.
   * @param row field row (zero-based)
   * @param column field columnt (zero-based)
   * @return Field value
   */
  def pascal(row: Int, column: Int): Int = {
    if (row < 0 || column < 0 || column > row)
      throw new IllegalArgumentException("Invalid position")
    else if (column == 0 || row == 0 || column == row)
      1
    else
      pascal(row - 1, column - 1) + pascal(row - 1, column)
  }
}
