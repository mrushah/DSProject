package stack

class PostFixExpressionEvaluator(expression:String) {
 
  val internalStack = new Stack[Int]();
   private val operators = Array[Char]('+','-','*','/')
  
  val evaluateExpression = {
    
   val seq = expression.toSeq;
   if(seq.isEmpty == true) 0;
   else{
     
     for(a <- 0 to seq.size - 1)
     {
       if(isNumber(seq(a)) == true) {
         internalStack.push(seq(a).asDigit);
       }
       else if(isOperator(seq(a)) == true) {
         val x = internalStack.pop();
         val y = internalStack.pop();
         println("x= "+x +" y= "+y)
         internalStack.push(operate(seq(a),x,y))
       }
     }
     internalStack.pop()
    }
  }
  
  private def isNumber(n:Char):Boolean =   n.isDigit;
  
  
  private def addition(a:Int, b:Int):Int = {
    return a+b;
  }

  private def isOperator(o: Char) = operators.contains(o)
    
  private def operate(o: Char, x: Int, y: Int):Int = {
    o match {
      case '+' => x + y
      case '*' => x*y
      case '/' => y/x
      case '-' => y - x
      case _ => 0
    }
  }
  
}