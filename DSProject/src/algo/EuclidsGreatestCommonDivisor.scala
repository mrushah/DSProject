package algo

import java.util.Scanner


object EuclidsGreatestCommonDivisor extends App {
  
  val scan = new Scanner(System.in)
  val upper = scan.nextInt()
  val lower = scan.nextInt()
  
  System.out.println(calculateGCD(upper,lower))
  
  def calculateGCD(a:Int, b:Int):Int = {
    
    if(b == 0) return a;
    else calculateGCD(b, a%b)
  }
  
}