import org.scalatest.FlatSpec
import stack.Stack
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class StackSpec extends FunSuite {
  
 test( "A Stack should pop values in last-in-first-out order") {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }
  
 test("A  stack should not be empty when an element is pushed") {
   
    val stack = new Stack[Int]
    assert (stack.isEmpty == true)
    stack push 1;
    assert ((stack isEmpty) == false)
 }
 
 test("A when stack should throw exception when poped") {
   
   val stack = new Stack[Int]
   
   assertThrows[IllegalStateException](stack.pop());
   
 }
 
 test("A stack should return value of top element without removing it") {
   
   val stack = new Stack[Int]
   stack push 1;
   assert (stack.top == 1)
   
 }
 
}