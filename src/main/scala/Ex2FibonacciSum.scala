object Ex2FibonacciSum {

  lazy val fibonacciStream: Stream[Int] = 1 #:: 1 #:: fibonacciStream.zip(fibonacciStream.tail).map(e => e._1 + e._2)

  /**
   * Calculates sum of the first n fibonacci numbers.
   * @param n number of fibonacci elements to sum
   * @return Sum of first n fibonacci numbers
   */
  def fibonacciSum(n: Int): Int = {
    if (n < 0) throw new IllegalArgumentException("Invalid number")
    else fibonacciStream.take(n).sum
  }
}
