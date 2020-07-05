/*
Merge Two Singly Linked list
*/

import java.util.*;

class MergeSinglyLinkedList {
 
  public static class LinkedList {
    int value;
    LinkedList next;

    LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
  LinkedList p1=headOne;
	LinkedList p2=headTwo;
	LinkedList p1prev=null;
		while(p1!=null && p2!=null){
			
			if(p1.value<p2.value){
				p1prev=p1;
				p1=p1.next;
			}
			else{
				if(p1prev!=null) p1prev.next=p2;
				p1prev=p2;
				p2=p2.next;
				p1prev.next=p1;
			}
			
		}
		if(p1==null) p1prev.next=p2;
		if(headOne.value<headTwo.value) return headOne;
		else return headTwo;
  
  }
}
