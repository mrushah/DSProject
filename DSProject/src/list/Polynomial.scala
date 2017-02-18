package list

class Polynomial(maxDegree:Int , coefficientByDegreeAsIndex: Array[Int]) {
  
  
   def getMaxDegree():Int = maxDegree;
  
 def getCoefficientByDegreeAsIndex():Array[Int] = coefficientByDegreeAsIndex;
  
  def add(polynomial2:Polynomial):Polynomial = {
      val higherPolynomial = getHigherPolynomial(polynomial2,this)
      val arr = new Array[Int](higherPolynomial.getMaxDegree())
      for( a <- 0 to higherPolynomial.getMaxDegree() ) {
        arr(a) = getAdditionFactor(a, polynomial2.getCoefficientByDegreeAsIndex(), this.getCoefficientByDegreeAsIndex())
      }
    
      new Polynomial(higherPolynomial.getMaxDegree(),arr)
  }
  
  private def getHigherPolynomial(one:Polynomial , two:Polynomial):Polynomial = {
    
    return  ( if(one.getMaxDegree() > two.getMaxDegree()) one  else two )
    
  }
  private def getAdditionFactor(index:Int, arr1:Array[Int],arr2:Array[Int]) :Int = {
    
    val one = if(arr1.size < index+1 ) 0 else ( arr1(index))
    val two = if(arr2.size < index+1 ) 0 else ( arr2(index))
    
    one + two
    
  }
  
  
}