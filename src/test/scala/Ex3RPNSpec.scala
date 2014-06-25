import org.scalatest._

class Ex3RPNSpec extends FlatSpec with Matchers {
  "Exercise 3" should
    "work for simple examples" in {
    Ex3RPN.rpn("2 2 +") should equal(4)
    Ex3RPN.rpn("2 3 + 5 *") should equal(25)
    Ex3RPN.rpn("5 5 + 2 /") should equal(5)
  }

  it should "report an error for invalid values" in {
    a [IllegalArgumentException] should be thrownBy {
      Ex3RPN.rpn("-")
    }

    a [IllegalArgumentException] should be thrownBy {
      Ex3RPN.rpn("1 1")
    }

    a [IllegalArgumentException] should be thrownBy {
      Ex3RPN.rpn("2 3 + *")
    }
  }

  it should "work correctly for more complicated examples" in {
    Ex3RPN.rpn("2 2 + 2 2 + +") should equal(8)
    Ex3RPN.rpn(" 2 10 + 2 / 14 3 - 4 * + 2 /") should equal(25)
  }
}
