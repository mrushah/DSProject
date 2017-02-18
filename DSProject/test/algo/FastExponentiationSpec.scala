package algo

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FastExponentiationSpec extends FunSuite {
  
  test("n to power 0 is 1") {
    
    assertResult(1)(FastExponentiation.powerOf(456, 0))
    
  }
  
  test("n to power 1 is n") {
    assertResult(456)(FastExponentiation.powerOf(456, 1))
  }
  
  test("n to power a is n multiplied a times") {
    assertResult(456*456)(FastExponentiation.powerOf(456, 2))
  }
}