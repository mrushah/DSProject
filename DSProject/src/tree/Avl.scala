package tree

class Avl {
  
  private var root = null.asInstanceOf[AvlTreeNode];
  
  def insert( data:Int) = {
    
    if(root == null) {
      
      root = new AvlTreeNode();
      root.data = data
    }
    else {
      insert(data,root)
    }
    
    
    
    def insert(data:Int, node:AvlTreeNode):Any = {
      
    if(data < node.data) {
      
      if(node.leftNode == null) {
        node.leftNode = new AvlTreeNode();
        node.leftNode.data = data
      }
      else {
        insert(data,node.leftNode);
      }
    }
    else if(data > node.data) {
     if(node.rightNode == null) {
        node.rightNode = new AvlTreeNode();
        node.rightNode.data = data
      }
      else {
        insert(data,node.rightNode);
      }
      
     }
    val leftHeight = if(node.leftNode != null) node.leftNode.height else -1
    val rightHeight = if(node.rightNode != null) node.rightNode.height else -1
    
    if(scala.math.abs(leftHeight - rightHeight) == 2)
    {
        if(data < node.data)
        {
          if(node.leftNode != null && data < node.leftNode.data ) {
            
           rotateLeft(node);
            
          } else if (node.leftNode != null && data < node.leftNode.data) {
             
            rotateRight(node.leftNode);
            rotateLeft(node);
          
          }
        }else
        {
         if (node.rightNode != null && data > node.rightNode.data ) {
           
           rotateRight(node)
           
         }else if (node.rightNode != null && data < node.rightNode.data) {
            
           rotateLeft(node.rightNode);
           rotateRight(node);
          }
        }
    }
    adjustHeight(node);
    }
    
  }
  
  
  def adjustHeight(node:AvlTreeNode) = {
    
    val newleftHeight = if(node.leftNode != null) node.leftNode.height else -1
    val newrightHeight = if(node.rightNode != null) node.rightNode.height else -1
    node.height = scala.math.max(newleftHeight, newrightHeight) + 1

  }
  
  def rotateLeft(node:AvlTreeNode):Any = {
    var node1 = node;
    var nodeData = node.data;
    var node2 = node.leftNode
    node1.data = node2.data
    node2.data = nodeData
    node1.leftNode = node2.leftNode
    node2.leftNode = node2.rightNode
    node2.rightNode = node1.rightNode
    node1.rightNode = node2
    adjustHeight(node1);
    adjustHeight(node2);

    
  }
  
  
  def rotateRight(node:AvlTreeNode):Any = {
    var node1 = node;
    var nodeData = node.data;
    var node2 = node.rightNode
    node1.data = node2.data
    node2.data = nodeData
    node1.rightNode = node2.rightNode
    node2.rightNode = node2.leftNode
    node2.leftNode = node1.leftNode
    node1.leftNode = node2
    
    adjustHeight(node1);
    adjustHeight(node2);
    
  }
  
  
  def printTree() = {
      
      printTreeIter(root,"")
      
      def printTreeIter(node:AvlTreeNode,str:String):Any = {
        if(node != null){
         var string = ""; 
        for(a <- 0 to node.height) {
          string = string + "-"
        }
        printTreeIter(node.leftNode,str+"left")
        println(str+" "+string + node.data)
        printTreeIter(node.rightNode,str+"right")
        }
      }
    }
}