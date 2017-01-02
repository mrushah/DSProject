import queue.Queue
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class QueueSpec extends FunSuite {
  
  test("top of empty queue is null") {
    val queue = new Queue();
    assert(queue.top == null)
  }
  
  
  test("top of queue is 1 after enqueing 1") {
    val queue = new Queue[Int]();
    queue.enqueue(1);
    assert(queue.top == 1)
  }
  
  test("top of queue is 2 after enqueing 1 , 2 and dequeue operation") {
    val queue = new Queue[Int]();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.dequeue();
    assert(queue.top == 2)
  }
  
  test("dequeu returns first queued element"){
    val queue = new Queue[Int]();
    queue.enqueue(1);
    queue.enqueue(2);
    assert(queue.dequeue()==1);
  }
  
}