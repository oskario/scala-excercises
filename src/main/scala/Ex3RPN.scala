object Ex3RPN {

  /**
   * Evaluates given NPM-noted expression.
   * @param expression expression to be evaluated
   * @return The result of the expression
   */
  def rpn(expression: String): Double = {
    evaluate(expression.trim.split(" "), List[Double]())
  }

  /**
   * Evaluates given expression (recursively) using provided stack.
   * @param input input expression
   * @param stack stack
   * @return Result of given expression
   */
  private def evaluate(input: Seq[String], stack: List[Double]): Double = {
    if (input.size > 0) {
      input.head match {
        case "+" => evaluate(input.tail, eval((a, b) => b + a, stack))
        case "-" => evaluate(input.tail, eval((a, b) => b - a, stack))
        case "*" => evaluate(input.tail, eval((a, b) => b * a, stack))
        case "/" => evaluate(input.tail, eval((a, b) => b / a, stack))
        case char => evaluate(input.tail, char.toInt :: stack)
      }
    } else {
      if (stack.size == 1) stack.head
      else throw new IllegalArgumentException("Invalid expression (unexpected end of input)")
    }
  }

  /**
   * Takes first two values from the stack, applies given operation
   * and puts the result back onto the stack.
   * @param f operation to apply
   * @param stack stack of numbers
   * @return New stack with result on top
   */
  private def eval(f: (Double, Double) => Double, stack: List[Double]): List[Double] = {
    if (stack.size < 2) throw new IllegalArgumentException("Invalid expression")
    val a :: b :: t = stack
    f(a, b) :: t
  }
}
