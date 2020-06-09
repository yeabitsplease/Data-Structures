/*

Note: The Structure of each function should not be changed. They are designed according to the algorithm. Changes might result in improper functioning or errors.
	  The functions are easy to comprehend but for a better understanding refer to the alogithm of a doubly linked list.

*/

class DoublyLinkedList {

  static class Node{
    public int value;
    public Node previous;
    public Node next;
    
    public Node(int value){
     this.value=value;   
    }
  }
  
  
  static class DoublyLL{
  public Node head;
  public Node tail;
  
  public void removeNodePointers(Node node){
      if(node.previous!=null)
          node.previous.next=node.next;
      if(node.next!=null)
          node.next.previous=node.previous;
      
      node.previous=null;
      node.next=null;
  }
  
  // O(1)TIME And O(1)SPACE
  public void remove(Node node){
      if(node==head)
          head=head.next;
      else if(node==tail)
          tail=tail.previous;
      removeNodePointers(node);
  }
  
  // O(1)TIME And O(1)SPACE
  public void insertBefore(Node node,Node nodeToInsert){
      
       if(nodeToInsert==head && nodeToInsert==tail) return;
       remove(nodeToInsert);
       nodeToInsert.previous=node.previous;
       nodeToInsert.next=node;
       if(node.previous==null){
       head=nodeToInsert;
       }
       else{
       node.previous.next=nodeToInsert;
       }
       node.previous=nodeToInsert;
  }
       
   // O(1)TIME And O(1)SPACE
  public void insertAfter(Node node,Node nodeToInsert){
       
      if(nodeToInsert==head && nodeToInsert==tail) return;
      remove(nodeToInsert);
      nodeToInsert.previous=node;
      nodeToInsert.next=node.next;
      if(node.next==null){
       tail=nodeToInsert;
       }
       else{
       node.next.previous=nodeToInsert;
       }
      node.next=nodeToInsert;
    }
  
  // O(p)TIME And O(1)SPACE
  public void insertAtPosition(int position, Node nodeToInsert){
      if(position==1){
          setToHead(nodeToInsert);
          return;
      }
      Node node=head;
      int currentPosition=1;
      while(node!=null && currentPosition++ != position )node=node.next;
          
          if(node!=null)
              insertBefore(node,nodeToInsert);
          else
              setToTail(nodeToInsert);
      
    }
  
  // O(1)TIME And O(1)SPACE
  public void setToHead(Node node){
    if(head==null){
    head=node;
    tail=node;
    return;
  }
    insertBefore(head,node);
  }
  
  // O(1)TIME And O(1)SPACE
  public void setToTail(Node node){
    if(tail==null){
    setToHead(node);
    return;
  }
    insertAfter(tail,node);
  }
  
  // O(n)TIME And O(1)SPACE
  public void removeNodesWithValue(int value) {
     Node node=head;
     while(node!=null){
     Node nodeToRemove=node;
     node=node.next;
     if(nodeToRemove.value == value)
         remove(nodeToRemove);
     }
    }

  // O(n)TIME And O(1)SPACE
  public boolean containsNodeWithValue(int value) {
      Node node=head;
      while(node != null && node.value != value ) node=node.next;
      return node != null;
    }
  
  
  }
  
  }
