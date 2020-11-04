/*
 
 Breadth First Search Implementation
 Time Complexity :O(V+E) where v is the number of vertices and e is the number of edges in the graph.
 Space Complexity:O(V) 
 
 In the question below v is the total number of nodes in the tree and e is the total no of lines joining the
 two nodes.
 
 */
import java.util.*;
 class BreadthFirstSearch {
	static class Node{
		String name;
		List<Node> children=new ArrayList<Node>();
		
		public Node(String name){
			this.name=name;
		}
		
		public List<String> breadthFirstSearch(List<String> array){
			Queue<Node> queue=new LinkedList<Node>();
			queue.add(this);
			while(!queue.isEmpty()){
				Node current=queue.poll();
				array.add(current.name);
				queue.addAll(current.children);
			}
			printArray(array);
			return array;
		}
		
		public Node addChild(String name){
			Node child=new Node(name);
			children.add(child);
			return this;
		}
		
		private void printArray(List<String> array) {
            System.out.println(array);
        }
	}

	
	
	public static void main(String args[]){
		BreadthFirstSearch.Node test1=new BreadthFirstSearch.Node("A");
		test1.addChild("B");
		test1.addChild("C");
		test1.addChild("D");
		test1.children.get(0).addChild("E");
		test1.children.get(0).addChild("F");
		test1.children.get(2).addChild("G");
		test1.children.get(2).addChild("H");
		test1.children.get(0).children.get(1).addChild("I").addChild("J");
		test1.children.get(2).children.get(0).addChild("K");
		
		List<String> inputArray=new ArrayList<String>();
		test1.breadthFirstSearch(inputArray);
		
		
		
	}
	
}
