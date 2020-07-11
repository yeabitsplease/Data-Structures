import java.util.*;
/*

Find the sum of every branch that is from root to every leaf node and add it to the list and print the list.
eg: tree->[1,2,3,4,5,6,7,8,9,10]
left child=2i+1
rigth child=2i+2

output->[15,16,18,10,11]

*/
class BranchSums{
  
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
	
	public static List<Integer> branchSums(BinaryTree root){
		List<Integer> sum=new ArrayList<Integer>();
		calculateBranchSum(root,0,sum);
		return sum;
	}
public static void calculateBranchSum(BinaryTree Node,int runningSum,List<Integer> sum){
		if(Node==null) return;
		int newRunningSum=runningSum+ Node.value;
		if(Node.left==null && Node.right==null){
			sum.add(newRunningSum);
			return;
		}
	
	
calculateBranchSum(Node.left,newRunningSum,sum);
	calculateBranchSum(Node.right,newRunningSum,sum);
	}
}

  