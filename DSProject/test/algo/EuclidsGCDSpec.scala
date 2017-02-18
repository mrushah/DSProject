package algo

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class EuclidsGCDSpec extends FunSuite {
 
  test("Greatest common denominator of 1 and 1 should be 1") {
    assertResult(EuclidsGreatestCommonDivisor.calculateGCD(1, 1))(1)
  }
  
  test("Greatest common denominator of two prime numbers should be 1") {
    assertResult(EuclidsGreatestCommonDivisor.calculateGCD(3, 11))(1)
  }
  
  test("Greatest common denominator of 10 and 20 is 10") {
    assertResult(EuclidsGreatestCommonDivisor.calculateGCD(10, 20))(10)
  }
  
}