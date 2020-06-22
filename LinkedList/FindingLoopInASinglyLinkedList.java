/*
Write a program that takes head of a singly Linked list as input and 
returns the node from where the loop originates in the list.

EG:
|<--D--->|
0->1->2->4->5-> 6 
         |      | 
	9 <-8 <-7 
		
In the above example the output is 4 because the loop originates at 4.

Approach used: Two Pointer approach. Let the 2 pointer be first and second at the head.
               (For every increase in first pointer we increment second pointer by 2) until first and second pointer overlapp eaach other.
			   
			   In the above example incrementing first pointer by 1 and second by 2 they overlapp each other at 7 ,
			   after the second pointer takes a full circle aound the loop and then traverses again from 4,5,6 to 7.
			   
			   So, f & s overlapp at 7.
			   
			   MATHEMATICS PART
			   Now, Let the distance btw head and origin of loop be D,
			        Let the distance btw origin of loop and the node where f ans s overlapp be P.
					Let the ditance from overlapping node to the origin of loop be R.
					
			        if f covers a distance of x. So, s covers twice the distance of f pointer.
					f=x,s=2x
					f=D+P, s=2D+2P
					Let the distance of entire Linked List be T.
					T=total distance covered by the second pointer-P(because, second pointer traversed through the list once then traversed from 4,5,6 to 7 again)
					T=2D+2P-P
					T=2D+P -----------------------------------------------------EQUATION#
					
					R=T-(D+P)
					replacing value of T in R from EQUATION#
					R=2D+P-P-D
				----------	
					R=D
				----------

					This tells us that the distance between head to origin of loop is equal to ditance between overlapping node and Node where the loop originates.
					
					Now, moving back the f pointer to head.
					we knoe that D=R, so move f and s simultaneously .
					When f and s overlapp we get the origin of loop .
					return f pointer.
					
					
					
					

*/
import java.util.*;
class FindingLoopInASinglyLinkedList {
static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
   static LinkedList findLoop(LinkedList head) {
    LinkedList first=head.next;
		LinkedList second=head.next.next;
		while(first!=second){
			first=first.next;
			second=second.next.next;
		}
		first=head;
    while(first!=second){
			first=first.next;
			second=second.next;
		}
		return first;
  }

  
}
