/*

Number of ways to traverse a graph if you can go only right and down.
Given: dimensions of 2D Matrix

*/

import java.util.*;

class NumberOfWaysToTraverseGraph {

  public int numberOfWaysToTraverseGraph(int width, int height) {
    if(width == 1 || height == 1){
			return 1;
		}
		
		return numberOfWaysToTraverseGraph(width - 1, height) + numberOfWaysToTraverseGraph(width, height - 1);
  }
}
