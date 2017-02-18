import org.scalatest.FunSuite

import list.Polynomial


class PolynomialAdditionSpec extends FunSuite{
  
  test("Test addition of two polynomials")
  {
    val poly1 = new Polynomial( 4,Array(1,2,3,4)); 
    val poly2 = new Polynomial( 4,Array(1,2,3,4));
    val poly3 = poly1.add(poly2);
    assert(poly3.getMaxDegree()===4)
    assert(poly3.getCoefficientByDegreeAsIndex()(0)===2)
  }
  
  test("Test multiplication of two polynomials ( Strassen’s Matrix Multiplication.)"){
    
  }
  
  test("Test multiplication of two polynomials ( Fast foriour transform.)"){
    
  }
  
}