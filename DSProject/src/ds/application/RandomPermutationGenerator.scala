package ds.application

import scala.util.Random


object RandomPermutationGenerator {
  
  
  val n = 640000;
  val permutationArr  = Array.fill[Int](n)(-1);
  val copyArr  = Array.fill[Int](n)(-1);
  val ran = new Random();
  
   def main(args: Array[String]) {
   permutationGenerator();
   }
  
  def permutationGenerator( ) = {
    var starttime = System.currentTimeMillis();
    for( a <- 0 to n-1) {
      var foundNumber = false;
      while(!foundNumber)
      {
         val newRandom =  ran.nextInt(n);
        if(copyArr(newRandom)!= 1)
        {
          permutationArr(a) = newRandom;
          copyArr(newRandom) = 1;
          foundNumber = true;
        }
      }
      }
  //  System.out.print(permutationArr.mkString(","))
    System.out.println("")
    System.out.println(System.currentTimeMillis() - starttime )
  }
  
}