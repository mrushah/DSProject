package ds.application

import java.util.Scanner
//Kadane's Algo

object MinimumSubSequenceGenerator extends App {
  
  val scan = new Scanner(System.in);
  val length = scan.nextInt();
  val array = new Array[Int](length);
  for(z <- 0 to length - 1)
  {
    array(z) = scan.nextInt();
  }
  
  System.out.println(calculateMaxSubsequenceProduct(array));
  
  def minimumSubSequence(arr:Array[Int]):Int = {
    
    var minSum = 0;
    var currSum = 0;
    
    for( i <- 0 to arr.length - 1)
    {
     currSum = scala.math.min(arr(i),currSum+arr(i))
     minSum =  scala.math.min(minSum, currSum);
    }
    
    return minSum;
    
  }
  
  def minimumPositiveSubSequence(arr:Array[Int]):Int = {
    
    val twodimensionalarray = Array.ofDim[Int](arr.length, arr.length)
    
    for(i <- 0 to arr.length-1)
    {
      calculateSumOfNumbersFromAndTo(i,arr.length-1,arr,twodimensionalarray);
    }
    twodimensionalarray.foreach { x => { System.out.println("[") ;x.foreach { x => System.out.print(x+" ") } ;System.out.println("]") ;} }
    return 0;
  }
  
  def calculateSumOfNumbersFromAndTo(start:Int,end:Int,arr:Array[Int],twoDimension:Array[Array[Int]]):Int = {
   
    if(start == end) 
    {
      twoDimension(start)(end) = arr(end)
    }
    else
    {
      twoDimension(start)(end) = calculateSumOfNumbersFromAndTo(start, end -1 ,arr, twoDimension) + arr(end);
    }
    return twoDimension(start)(end)
  }
  
  def calculateMaxSubsequenceProduct(arr:Array[Int]):Int = {
    
    var max_curr_prod = 1;
    var min_curr_prod = 1
    
    var max_overall_prod = 1;
    
    for(a <- 0 to arr.length - 1) {
      
      if(arr(a) > 0) {
        
        max_curr_prod = max_curr_prod* arr(a);
        min_curr_prod = scala.math.min(1, min_curr_prod * arr(a));
      }
      else if (arr(a) == 0)
      {
       var max_curr_prod = 1;
       var min_curr_prod = 1
      }
      else
      {
        val temp = max_curr_prod
        max_curr_prod = scala.math.max(1,min_curr_prod * arr(a));
        min_curr_prod = temp * arr(a)
      }
      
      if(max_overall_prod < max_curr_prod) max_overall_prod = max_curr_prod;
    }
    
    
    
    return max_overall_prod;
  }
  
}