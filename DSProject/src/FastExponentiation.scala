

object FastExponentiation extends App {
  
  
  System.out.println(powerOf(4,4))
  
  def powerOf(a:Int, b:Int):Int = {
    
    var result = 1;
    var a1 = a;
    var b1 = b;
    while(b1!=0)
    {
      if(b1%2==1)
      {
        result*=a1;
      }
      b1 = b1/ 2;
      a1 = a1* a1;
      
    }
    return result
  }
}