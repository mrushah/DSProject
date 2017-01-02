package queue

import list.LinkedListImpl
import list.Node

class Queue[T : Manifest] {

  private val list = new LinkedListImpl[T]();
  private var lastNode = list.head.next;

  def top = {
    if(lastNode != null) lastNode.value
    else  null
  }
  
  def dequeue():T =  {
    
    if(lastNode!=null)
    {
      val retval = list.head.next.value;
      list.head.next = list.head.next.next;
      if(list.head.next == null) lastNode = null
      
      retval
    }
    else null.asInstanceOf[T]
  }

  def enqueue(value:T) = {

    val node = new Node(value,null);
    
    if(lastNode == null) {
      list.head.next = node
      lastNode = node
    }
    else { 
      lastNode.next = node ;
      lastNode = node;
    }
  }
}