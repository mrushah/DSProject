package list

import scala.collection.mutable.Stack

object ListTest extends App {
  
  val list = new LinkedListImpl[Int]();
  
  list insert 1;
  list.insert(2);
  list.insert(3);
  list.insert(3);
  list.print();
  list.delete(3);
  list.print();
  System.out.println(list.findKth(1))
  System.out.println(list.find(1))
  
}