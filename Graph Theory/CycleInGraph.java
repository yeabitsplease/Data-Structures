/*
Given an adjacency list containing the unweighted edges of a directed graph, write a function that returns true if the graph contains cycle and false if it doesn't.
*/

import java.util.*;

class CycleInGraph {

  public boolean cycleInGraph(int[][] edges) {
    
		int numberOfNodes = edges.length;
		boolean[] visited = new boolean[numberOfNodes];
		boolean[] currInStack = new boolean[numberOfNodes];
		Arrays.fill(visited, false);
		Arrays.fill(currInStack, false);
		
		for(int node = 0; node < numberOfNodes; node++){
			if(visited[node]){
				continue;
			}
			boolean containsCycle = isNodeInCycle(node, edges, visited, currInStack);
			if(containsCycle){
				return true;
			}
		}
    return false;
  }
	
	public boolean isNodeInCycle(int node, int[][] edges, boolean[] visited, boolean[] currInStack){
		visited[node] = true;
		currInStack[node] = true;
		
		boolean containsCycle = false;
		int[] neighbours = edges[node];
		for(int neighbour : neighbours){
			if(!visited[neighbour]){
				containsCycle = isNodeInCycle(neighbour, edges, visited, currInStack);
			}
			if(containsCycle){
				return true;
			} else if(currInStack[neighbour]){
				return true;
			}
		}
		currInStack[node] = false;
		return false;
	}
}
