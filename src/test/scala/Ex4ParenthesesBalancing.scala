import org.scalatest._

class Ex4ParenthesesBalancing extends FlatSpec with Matchers {
  "Exercise 3" should
    "work for simple examples" in {
    Ex4ParenthesesBalancing.isBalanced("(this is balanced)") should equal(true)
    Ex4ParenthesesBalancing.isBalanced("(oh, this (is) balanced (too))") should equal(true)
    Ex4ParenthesesBalancing.isBalanced("(this is (not balanced)") should equal(false)
    Ex4ParenthesesBalancing.isBalanced(")()()()(") should equal(false)
  }

  it should "work correctly for more complicated examples" in {
    Ex4ParenthesesBalancing.isBalanced("(((((((((((((((((((") should equal(false)
    Ex4ParenthesesBalancing.isBalanced(" (     ) ") should equal(true)
    Ex4ParenthesesBalancing.isBalanced("") should equal(true)
  }
}
