 import java.util.*;

    class MinHeapImplementation{
    
        List<Integer> heap=new ArrayList<Integer>();
        public MinHeapImplementation(ArrayList<Integer> array){
        
            heap=buildHeap(array);
            System.out.println(heap);
        }

     
        
        
        
    public  List<Integer> buildHeap(ArrayList<Integer> array){
        
     int firstParentIdx=(array.size()-2)/2;
     for(int currentIdx=firstParentIdx;currentIdx>=0;currentIdx--){
     
     siftDown(currentIdx,array.size()-1,array);
     
     }
        
        return array;
    }
        
        
    public void siftDown(int currentIdx, int endIdx, List<Integer> heap){
    
    int childOneIdx= currentIdx*2+1;
    while(childOneIdx<=endIdx){
    
    int childTwoIdx=currentIdx*2+2 <= endIdx?currentIdx*2+2:-1;
    int idxToSwap;
    if(childTwoIdx!=-1 && heap.get(childTwoIdx)< heap.get(childOneIdx)){
    
        idxToSwap=childTwoIdx;
    
    }
    else{
     
        idxToSwap=childOneIdx;
        
    }
    
    if(heap.get(idxToSwap)<heap.get(currentIdx)){
    
    swap(currentIdx,idxToSwap,heap);
    currentIdx=idxToSwap;
    childOneIdx=currentIdx*2+1;
        
    }
    else{
        
     return;
        
    }
        
    }
    
    }
    
    
    
    public void siftUp(int currentIdx, List<Integer> heap){
    
    int parentIdx=(currentIdx-1)/2;
    while(currentIdx>0 && heap.get(currentIdx)<heap.get(parentIdx)){
    
    swap(currentIdx,parentIdx,heap);
    currentIdx=parentIdx;
    parentIdx=(currentIdx-1)/2;
        
    }
    
    }
    
    
    public int peek(){
    
        return heap.get(0);
    
    }
    
    public int remove(){
    
    swap(0,heap.size()-1,heap);
    int valueToRemove=heap.get(heap.size()-1);
    heap.remove(heap.size()-1);
    siftDown(0,heap.size()-1,heap);
    return valueToRemove;
    
    }
    
    
    
    
    public void insert(int value){ 
        heap.add(value);
        siftUp(heap.size()-1,heap);
        System.out.println("Value Inserted Successfully!");
        System.out.println(heap);
     
        
    }
    
    
    
    public static void swap(int i, int j, List<Integer> Heap){
     Collections.swap(Heap, i, j); 
         }
    
    

    
    
    public static void main(String args[]){
        
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of heap: ");
     int n = sc.nextInt();   
    
     ArrayList<Integer> Array=new ArrayList<Integer>(n);
     for(int i=0;i<n;i++){
         int value=sc.nextInt();
         Array.add(value);
     }
     //BUILDING A HEAP
     System.out.println("Building Heap!");
     MinHeapImplementation Object=new MinHeapImplementation(Array);
     
     //PEEK FUNCTION
     System.out.println("Implementing Peek!");
     int heapPeek=Object.peek();
     System.out.println(heapPeek);
     
     //INSERTION 
     System.out.println("Enter the value to be inserted: ");
     int value=sc.nextInt();
     Object.insert(value);
     
     //REMOVING ROOT
     System.out.println("Removing root!");
     int valueToRemove=Object.remove();
     System.out.println("Value "+valueToRemove+" removed successfully!");
     
     /*
     IMPLEMENTATION OF DRIVER
     
     Enter the size of heap: 
10
10 9 8 7 6 5 4 3 2 1
Building Heap!
[1, 2, 4, 3, 6, 5, 8, 10, 7, 9]
Implementing Peek!
1
Enter the value to be inserted: 
11
Value Inserted Successfully!
[1, 2, 4, 3, 6, 5, 8, 10, 7, 9, 11]
Removing root!
Value 1 removed successfully!
     
     
     */
        
    }
    }
   