import java.util.*;
public class InsertionSort {
    
    static void insertionSort(int[] x){
    
        for(int i=1;i<x.length;i++){
        int value=x[i];
        int hole=i;
        while(hole>0&& x[hole-1]>x[hole]){
        
            x[hole]=x[hole-1];
            hole--;
            x[hole]=value;
            
        }
        
        
        }
    
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
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
    
        insertionSort(a);
        printArray(a);
    }
    
    
    
}
