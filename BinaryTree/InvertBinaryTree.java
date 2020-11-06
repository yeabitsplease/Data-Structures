class InvertBinaryTree{
	static class BinaryTree{
		public int value;
		public BinaryTree left;
		public BinaryTree right;
		
		public BinaryTree(int value){
			this.value=value;
		}
	}
	
	public static void invertBinaryTree(BinaryTree tree){
		ArrayDeque<BinaryTree> queue=new ArrayDeque<BinaryTree>();
		queue.addLast(tree);
		while(queue.size()>0){
			BinaryTree current=queue.pollFirst();
			swapLeftAndRight(current);
			if(current.left!=null){
				queue.addLast(current.left);
			}
			if(current.right!=null){
				queue.addLast(current.right);
			}
		}
	}
	
	public static void swapLeftAndRight(BinaryTree tree){
		BinaryTree left=tree.left;
		tree.left=tree.right;
		tree.right=left;
	}
}