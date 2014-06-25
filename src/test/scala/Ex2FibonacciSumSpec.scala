import org.scalatest._

class Ex2FibonacciSumSpec extends FlatSpec with Matchers {
  "Exercise2" should
    "work for simple values" in {
    Ex2FibonacciSum.fibonacciSum(0) should equal(0)
    Ex2FibonacciSum.fibonacciSum(1) should equal(1)
    Ex2FibonacciSum.fibonacciSum(3) should equal(4)
    Ex2FibonacciSum.fibonacciSum(7) should equal(34)
  }

  it should "report an error for invalid values" in {
    a [IllegalArgumentException] should be thrownBy {
      Ex2FibonacciSum.fibonacciSum(-1)
    }
  }
}
