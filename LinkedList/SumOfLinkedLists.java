/*

You are given two linkedlist of potentially unequal lengths.
Each linkedlist represents a non-negative integer, where each node in the linkedList is a digit of that integer, and the first node in the linkedList represents the least significant digit in the integer. Write a function that returns the head of the new linkedlist that represents  the sum of the integers represented by the two inout linkedlist.

eg: linkedListOne : 2 -> 4 -> 7 -> 1
    linkedListTwo : 9 -> 4 -> 5
	
	Output: 1 -> 9 -> 2 -> 2
	//linkedListOne represents 1742
	//linkedListTwo represents 594
	//1742 + 594 = 2291
	

*/

import java.util.*;

class SumOfLinkedLists {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

	//O(max(n,m)) time | O(max(n,m)) space
  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    LinkedList newLinkedListHeadPointer = new LinkedList(0);
		LinkedList currentNode = newLinkedListHeadPointer;
		int carry = 0;
		
		LinkedList nodeOne = linkedListOne;
		LinkedList nodeTwo = linkedListTwo;
		
		while(nodeOne != null || nodeTwo != null || carry != 0){
			int valueOne = (nodeOne != null) ? nodeOne.value : 0;
			int valueTwo = (nodeTwo != null) ? nodeTwo.value : 0;
			int sumOfValues = valueOne + valueTwo + carry;
			
			int newValue = sumOfValues % 10;
			LinkedList newNode = new LinkedList(newValue);
			currentNode.next = newNode;
			currentNode = newNode;
			
			carry = sumOfValues / 10;
			nodeOne = (nodeOne != null) ? nodeOne.next : null;
			nodeTwo = (nodeTwo != null) ? nodeTwo.next : null;
			
		}
		return newLinkedListHeadPointer.next;
  }
}
