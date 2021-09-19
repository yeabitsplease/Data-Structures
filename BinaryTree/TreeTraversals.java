import java.util.*;
class Node{
	int value;
	Node left;
	Node right;
	
	public Node(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}
class TreeTraversals{
	static Node root;
	static void printPreorder(Node node){
		if(node == null){
			return;
		}
		
		System.out.print(node.value + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
		
	static void printInorder(Node node){
		if(node == null){
			return;
		}
		
		printInorder(node.left);
		System.out.print(node.value + " ");
		printInorder(node.right);
	}
	
	static void printPostorder(Node node){
		if(node == null){
			return;
		}
		
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.value + " ");
	}
	
	
	public static void main(String args[]){
		
		TreeTraversals tree = new TreeTraversals();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.print("Preorder Traversal: ");
		printPreorder(tree.root);
		System.out.println();
		System.out.print("Inorder Traversal: ");
		printInorder(tree.root);
		System.out.println();
		System.out.print("Postorder Traversal: ");
		printPostorder(tree.root);
		
		
	}
}

