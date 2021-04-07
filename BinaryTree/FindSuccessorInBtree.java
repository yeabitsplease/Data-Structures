/*

Write a function that takes in a binary tree and a node and the returns the successor to that node in inorder travesal.

*/

import java.util.*;
import java.util.ArrayList;

class FindSuccessorInBtree {

  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

	//O(n) time | O(n) space where n is the number of nodes in the tree.
  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    ArrayList<BinaryTree> inOrderTraversal=new ArrayList<BinaryTree>();
		getInorderTraversal(tree, inOrderTraversal);
		
		for(int i=0; i< inOrderTraversal.size(); i++){
			BinaryTree currentNode=inOrderTraversal.get(i);
			
			if(currentNode != node){
				continue;
			}
			if(i == inOrderTraversal.size()-1){
				return null;
			}
			return inOrderTraversal.get(i+1);
		}
		return null;
  }
	
	void getInorderTraversal(BinaryTree node, ArrayList<BinaryTree> order){
		if(node == null){
			return;
		}
		getInorderTraversal(node.left, order);
		order.add(node);
		getInorderTraversal(node.right, order);
	}
}
