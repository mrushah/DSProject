import org.scalatest.FlatSpec
import stack.Stack
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import tree.Avl

@RunWith(classOf[JUnitRunner])
class MultiStackSpec extends FunSuite {
  
  test("Test creation of Avl Tree")  {

    val avltree = new Avl( );
    
    avltree insert 16
    
    avltree insert 15
    
    avltree insert 14
    
    avltree insert 13
    
    avltree insert 12
    
    avltree insert 11
    
    avltree insert 10
    
    avltree insert 8
    
    avltree insert 9
    
    avltree printTree
  
  }
  
}