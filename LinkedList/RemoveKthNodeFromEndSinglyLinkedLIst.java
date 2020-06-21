/*

input->Head of a singly Linked List and an integer k.
Output->Successful removal of kth node from the end in the List.

eg:
 INPUT
   head=0->1->2->3->4->5->6->7->8->9
   k=4
  OUTPUT
   Removal of Node with value 6.
   
   
   Time Complexity=o(n) , n is the number of nodes in the linked list.
   Space Complexity=o(1), because we are just keeping the track of node, we aren't storing anything.
   
   Approach used= 2 pointer approach.
                  first and second pointer both point toward the head of the node.
		  Shift the second pointer to k nodes ahead;
		  Move first and second pointer simultaneously until second pointer reaches to null.
		  remove frist pointer.
		  
    
    

*/
import java.util.*;

class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    int counter=1;
		LinkedList first=head;
		LinkedList second=head;
		while(counter<=k){
			second=second.next;
			counter++;
		}
		if(second==null){
			head.value=head.next.value;
			head.next=head.next.next;
			return;
		}
		while(second.next!=null){
		second=second.next;
			first=first.next;
		}
		first.next=first.next.next;
		}
  

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
