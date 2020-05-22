/*

Space Complexity: O(1)
Time Complexity: O(n^2)  {Worst Case}
                 O(n)   {Best Case}

*/

import java.util.*;
public class InsertionSort {
    
    public static int[] insertionSort(int[] x){
    
        if(x.length==0)
            return new int[] {};
        
        for(int i=1;i<x.length;i++){
        
            int j=i;
            while(j>0 && x[j-1]>x[j]){
            int temp=x[j-1];
            x[j-1]=x[j];
            x[j]=temp;
            j--;
            }
        
        }
        return x;
        
    }
    
    static void printArray(int[] arr){
    
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");   
        }
        System.out.println();
    
    }
    
    
    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of entries in the array: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
        }
    
        insertionSort(array);
        printArray(array);
    }
    
    
    
}
