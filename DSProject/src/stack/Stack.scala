package stack

import list.LinkedListImpl
import list.Node

class Stack[T : Manifest] {
  
  private val list = new LinkedListImpl[T]();
  
  def top():T = {
    if (isEmpty) { throw new IllegalStateException }
    
    return list.head.next.value
    
  }
  
  def push(ele:T) = {
    val node = new Node(ele,list.head.next);
    list.head.next = node;
  }
  
  def pop():T = {
    
    if (isEmpty) {throw new IllegalStateException}
    
    val node = list.head.next;
    list.head.next = list.head.next.next;
    return node.value
  }
  
  def isEmpty():Boolean = {
    
    return list.head.next == null
  }
  
}