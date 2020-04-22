class Program {
  
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
		array.add(this.name);
			for(int i=0;i<children.size();i++){
				
				children.get(i).depthFirstSearch(array);
				
			}
			
			 printArray(array);
                         return array;		
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }

        private void printArray(List<String> array) {
            System.out.println(array);
        }
  }
  
  
  public static void main(String args[]){
  
      Program.Node test1=new Program.Node("A");
      test1.addChild("B");
      test1.addChild("D");
      test1.children.get(0).addChild("E");
      test1.children.get(0).addChild("F");
      test1.children.get(1).addChild("G");
      test1.children.get(1).addChild("H");
      List<String> inputArray=new ArrayList<String>();
      test1.depthFirstSearch(inputArray);
  }
  
}
