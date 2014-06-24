import org.scalatest._

class Ex1PascalsTriangleSpec extends FlatSpec with Matchers {
  "Exercise1" should
    "work for simple values" in {
    Ex1PascalsTriangle.pascal(0, 0) should equal(1)
    Ex1PascalsTriangle.pascal(2, 1) should equal(2)
    Ex1PascalsTriangle.pascal(3, 2) should equal(3)
    Ex1PascalsTriangle.pascal(2, 0) should equal(1)
    Ex1PascalsTriangle.pascal(3, 1) should equal(3)
  }

  it should "report an error for wrong values" in {
    a [IllegalArgumentException] should be thrownBy {
      Ex1PascalsTriangle.pascal(-1, -1)
    }
  }

  it should "work correctly for big values" in {
    Ex1PascalsTriangle.pascal(10, 5) should equal(252)
    Ex1PascalsTriangle.pascal(20, 7) should equal(77520)
    Ex1PascalsTriangle.pascal(100, 100) should equal(1)
  }
}
