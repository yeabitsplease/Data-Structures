import java.util.*;
public class BubbleSort {
    
    static int[] bubbleSort(int[] array){
    
     if(array.length==0){
    return new int[] {};
	}
		
	boolean isSorted=false;
	int flag=0;
	
	while(!isSorted){
		
		isSorted=true;
		for(int i=0;i<array.length-1-flag;i++){
			if(array[i]>array[i+1]){
			int temp=array[i];
			array[i]=array[i+1];
			array[i+1]=temp;
			isSorted=false;
			}
		}
		flag++;
	}
	return array;	
  }
        
   
    

    static void printArray(int arr[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of entries in the array: ");
    int n=sc.nextInt();
    int[] a=new int[n];
    
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    
    bubbleSort(a);
    printArray(a,n);
    
    }
}
