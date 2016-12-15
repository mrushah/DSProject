package list

class ArrayListImpl[T : Manifest] extends List[T] {
 
  private var array = new Array[T](1000);
  private var lastElementAtIndex = -1;
  
  def print() = {
    System.out.print("[")
    for(a <- 0 to lastElementAtIndex)
    {
      System.out.print("["+array(a))  
    }
    System.out.print("]")
  }
  
  def insert(ele: T): Unit = {
    
    if(lastElementAtIndex+1 == array.length) {
     var arrayTemp = new Array[T](array.length*2);
     for(a <- 0 to array.length - 1) {
       arrayTemp(a) = array(a);
     }
     array = arrayTemp;
    }
    lastElementAtIndex = lastElementAtIndex + 1;
    array(lastElementAtIndex) = ele;
  }

  def delete(pos: Int): Unit = {
    
    for(a <- pos to lastElementAtIndex){
      array(pos-1) = array(pos);
    }
    lastElementAtIndex = lastElementAtIndex - 1;
  }

  def find(ele: T): Int = {
    
    var found = false;
    var index = -1;
    while(!found && index < lastElementAtIndex) {
      index = index+1;
      if(ele == array(index)) found = true;
    }
    return index+1;
  }

  def findKth(post: Int): T = {
    return array(post-1);
  }
}