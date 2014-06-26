object Ex4ParenthesesBalancing {

  /**
   * Checks whether parentheses in given sentence are balanced.
   * @param sentence input sentence
   * @return True if parentheses are balanced, otherwise false
   */
  def isBalanced(sentence: String): Boolean = isBalanced(sentence, 0)

  private def isBalanced(sentence: String, count: Int): Boolean = {
    if (count < 0) false
    else if (sentence.size == 0) count == 0
    else sentence.head match {
      case '(' => isBalanced(sentence.tail, count + 1)
      case ')' => isBalanced(sentence.tail, count - 1)
      case _ => isBalanced(sentence.tail, count)
    }
  }
}
