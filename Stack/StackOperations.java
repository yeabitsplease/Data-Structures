import java.util.*;
import java.io.*;

public class StackOperations {
    
    StackOperations so=new StackOperations();
    static Scanner sc= new Scanner(System.in);
    
    
    static void stackPush(Stack<Integer> st){
    
        System.out.println("Enter number of elements to be entered: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        
            arr[i]=sc.nextInt();
        
        }
    
        for(int j=0;j<n;j++){
        
            st.push(arr[j]);
        
        }
        
        System.out.println("Push SUCCESSFUL");
    
    }
    
    
    static void stackPop(Stack<Integer> st){
        
    System.out.println("Pop :"); 
  
        while(st.size()>0)
        { 
            Integer m = (Integer) st.pop(); 
            System.out.println(m); 
                    
        } 
    } 
        
    
    
    static void stackPeek(Stack<Integer> st){
    
    Integer m=(Integer)st.peek();
    System.out.println("Element on top of the stack is: "+m);
    
    }
    
    static void stackSearch(Stack<Integer> st){
    System.out.println("Enter element to search in the stack: ");
    int m=sc.nextInt();
        Integer position=(Integer)st.search(m);
        if(position==-1)
        System.out.println("Element not found.");
        
        else
            System.out.println("Element found at position: "+position);
    
    }
    
    
    
    
    public static void main(String args[]){
        
     Stack<Integer> st=new Stack<Integer>();
      Scanner sc=new Scanner(System.in);
     stackPush(st); 
     stackPop(st); 
     stackPush(st);
     stackSearch(st);
     stackPeek(st);
    }
    
}
