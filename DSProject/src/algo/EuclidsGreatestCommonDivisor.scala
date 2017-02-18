package algo

import java.util.Scanner


object EuclidsGreatestCommonDivisor extends App {
  
  def calculateGCD(a:Int, b:Int):Int = {
    
    if(b == 0) return a;
    else calculateGCD(b, a%b)
  }
  
}