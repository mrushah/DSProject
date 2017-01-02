import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import stack.Stack
import stack.ExpressionEvaluator


@RunWith(classOf[JUnitRunner])
class ExpressionEvaluatorSpec extends FunSuite {
  
  test( "A balanced expression should be valid ") {
    val expressionEval = new ExpressionEvaluator("{(a)[ddf{ddf(dfdf)}]}")
    assert(expressionEval.isValid === true)
  }
  
  test ("A non balanced expression should not be valid") {
    val expressionEval = new ExpressionEvaluator("{(a)[ddf{ddf(}dfdf)}]}")
    assert(expressionEval.isValid === false)
  }
  
  test("Empty expression is valid") {
    val expressionEval = new ExpressionEvaluator("")
    assert(expressionEval.isValid === true)
  }
  
}