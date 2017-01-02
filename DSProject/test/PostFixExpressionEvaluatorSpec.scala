import stack.PostFixExpressionEvaluator
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite


@RunWith(classOf[JUnitRunner])
class PostFixExpressionEvaluatorSpec extends FunSuite {
  
  test("Result is zero for empty expression") {
    val evaluator = new PostFixExpressionEvaluator("") 
    assert(evaluator.evaluateExpression == 0)
  }
  
  test("Result of A B + is addition of A and B") {
    val evaluator = new PostFixExpressionEvaluator("45+") 
    assert(evaluator.evaluateExpression == 9)
  }
  
  test("Result of A B * is multiplication of A and B") {
    val evaluator = new PostFixExpressionEvaluator("45*") 
    assert(evaluator.evaluateExpression == 20)
  }
  
  test("Result of A B / is division of A and B rounded to nearest  decimal points") {
    val evaluator = new PostFixExpressionEvaluator("45/") 
    assert(evaluator.evaluateExpression == 0)
  }
  
  test("Result of A B / is division of A and B rounded to nearest  decimal points higher numerator") {
    val evaluator = new PostFixExpressionEvaluator("52/") 
    assert(evaluator.evaluateExpression == 2)
  }
  
  test("Result of A B - is substraction of A and B ") {
    val evaluator = new PostFixExpressionEvaluator("52-") 
    assert(evaluator.evaluateExpression == 3)
  }
  
  test("Result of a complex postfix expression is AB-C+ (A-B)+C") {
    val evaluator = new PostFixExpressionEvaluator("52-5+") 
    assert(evaluator.evaluateExpression == 8)
  }
  
}