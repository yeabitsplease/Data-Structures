import java.util.*;
public class SelectionSort {
   static void selectionSort(int[] x){
   int temp;
   int n=x.length;
    for(int i=0;i<n-1;i++){
         int min=x[i];
     for(int j=i+1;j<n;j++){
     
         if(x[j]<x[min])
              min=j;      
         {
         
             temp=x[min];
             x[min]=x[i];
             x[i]=temp;
         
         }
     
     }   
    }
   }
   
   
    static void printArray(int[] x){
    
        for(int i=0;i<x.length;i++){
         System.out.print(x[i]+" ");   
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
        
        selectionSort(a);
        printArray(a);
        
    
    }
}
