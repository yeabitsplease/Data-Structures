
/*

Write a function that takes in a BST and a target value and returns the closest value to that target value contained in the BST.

*/

import java.util.*;

class ClosestValueInBST {
  public static int findClosestValueInBst(BST tree, int target) {
   	return findClosestValueInBst(tree,target,tree.value);
  }
	
	public static int findClosestValueInBst(BST tree, int target, int closest){
		BST currentNode=tree;
		while(currentNode!=null){
			if(Math.abs(target-closest)>Math.abs(target-currentNode.value)){
				closest=currentNode.value;
			}
			if(target<currentNode.value){
				currentNode=currentNode.left;
			}
			else if(target>currentNode.value){
				currentNode=currentNode.right;
			} else{
					break;
			}
		}
		return closest;
	}
	
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
