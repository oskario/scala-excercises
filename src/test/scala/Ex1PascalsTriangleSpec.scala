import org.scalatest._

class Ex1PascalsTriangleSpec extends FlatSpec with Matchers {
  "Exercise1" should
    "work for simple values" in {
    Ex1PascalsTriangle.pascal(0, 0) should equal(1)
    Ex1PascalsTriangle.pascal(2, 1) should equal(2)
    Ex1PascalsTriangle.pascal(3, 2) should equal(3)
    Ex1PascalsTriangle.pascal(0, 2) should equal(1)
    Ex1PascalsTriangle.pascal(1, 3) should equal(3)
  }

  it should "report an error for wrong values" in {
    a [IllegalArgumentException] should be thrownBy {
      Ex1PascalsTriangle.pascal(-1, -1)
    }
  }
}
