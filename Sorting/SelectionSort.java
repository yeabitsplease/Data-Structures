/*

Space Complexity: O(1)
Time Complexity: O(n^2)  {Worst Case}
                 O(n)    {Best Case: When the array is sorted.}
 

*/


import java.util.*;
public class SelectionSort {
   public static int[] selectionSort(int[] x){
   
       int startIdx=0;
       while(startIdx<x.length-1){
       
       int smallestIdx=startIdx;
       for(int i=startIdx+1;i<x.length;i++){
       
       if(x[smallestIdx]>x[i]){
       smallestIdx=i;
       }
       
       }
       swap(startIdx,smallestIdx,x);
       startIdx++;
       }
       
       return x;
   }
   
 public static void swap(int i,int j, int[] array){
 
     int temp=array[i];
     array[i]=array[j];
     array[j]=temp;
 
 }
   
 
    
    
    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of entries in the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
        
        int x[]=selectionSort(a);
       for(int i=0;i<x.length;i++){
       System.out.print(x[i]+" ");
       
       }
        
    
    }
}
