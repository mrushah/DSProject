package list

trait List[T] {
  
  def insert(ele:T);
  
  def find(ele:T):Int;
  
  def delete(pos:Int);
  
  def findKth(post:Int):T;
  
}