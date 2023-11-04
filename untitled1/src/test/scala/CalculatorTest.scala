import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite{
  val obj = new Calculator()

  test("Basic Operations") {
    assert(obj.add(10, 5) == 15)
    assert(obj.subtract(10, 5) == 5)
    assert(obj.multiply(10, 5) == 50)
    assert(obj.divide(10, 5) == 2)

    println("All Test cases passed")
  }
}