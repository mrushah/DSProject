package list

class LinkedListImpl[T : Manifest] extends List[T] {
  
  var head = new Node(Nil.asInstanceOf[T],null);
  
  def delete(pos: Int): Unit = {
    var index = 0;
    var node = head;
    while(index<pos-1) {
      node = node.next
      index+=1;
    }
    var temp = node.next;
    node.next = node.next.next;
    temp.next = null;
  }

  def findKth(post: Int): T = {
    
    var index = 0;
    var node = head;
    while(index<post) {
      node = node.next
      index+=1;
    }
    return node.value;
  }

  def find(ele: T): Int = {
    var index = 0;
    var node = head.next;
    while(node != null && node.value == ele) 
    {
      node = node.next
      index+=1;
    }
    return index;
  }

  def insert(ele: T): Unit = 
  {
    var node = head;
    while(node.next != null) {
      node = node.next;
    }
    node.next = new Node(ele,null)
  }
  
   def print() = {
    System.out.print("[")
    var node = head;
   while(node.next != null) {
     System.out.print(node.next.value+"]");
     node = node.next;
   }
    System.out.print("]")
  }
}