package stack

class ExpressionEvaluator(expression:String) {
  
  val openingSymbol = Array('(','{','[');
  val closingSymbol = Array(')','}',']');
  val openCloseMap = Map(')'->'(','}'->'{',']'->'[');

  def isOpeningSymbol(s:Char):Boolean =   openingSymbol.contains(s);
  def isClosingSymbol(s:Char):Boolean =   closingSymbol.contains(s);
  def getCorrespondingOpeningSymbol(c:Char):Char = openCloseMap.getOrElse(c, '_')
  
  
  def isValid():Boolean = {
    
    val seq = expression.toSeq
    val Stack = new Stack[Char];
    var valid = true;
    try {
     for( x <- 0 to seq.size -1 ) 
     {
        if(isOpeningSymbol(seq(x))) 
         {
            Stack.push(seq(x));
        }
      else if(isClosingSymbol(seq(x)))
      {
        val p = Stack.pop();
        println("Opening "+getCorrespondingOpeningSymbol(seq(x)) + "  "+seq(x)+ " equal "+p.equals(getCorrespondingOpeningSymbol(seq(x))))
        valid = (p.equals(getCorrespondingOpeningSymbol(seq(x))))
      } 
     }
    } 
    catch {
      case t: Throwable => valid = false // TODO: handle error
    }     
   return valid
  }
  
}