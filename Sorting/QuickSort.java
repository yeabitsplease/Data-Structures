import java.util.*;
public class QuickSort {
    
    
    
    
    public void quickSort(int a[],int start,int end){
    
        if(start<end){
        
        int pIndex=partitionIndex(a,start,end );
        quickSort(a,start,pIndex-1);
        quickSort(a,pIndex+1,end);
        
        
        }
        
    
    }
    
    
    public int partitionIndex(int a[],int start,int end){
        
       int pivot=a[end];
       int pIndex=start;
       for(int i=start;i<end;i++){
       
           if(a[i]<=pivot){
           
               int temp1=a[i];
               a[i]=a[pIndex];
               a[pIndex]=temp1;
               pIndex++;
           
           }
           
       }
       
       int temp2=a[end];
       a[end]=a[pIndex];
       a[pIndex]=temp2;
       
       return pIndex;
    }
    
    static void printArray(int a[]){
    
    for(int i=0;i<a.length;i++){
    
    System.out.print(a[i]+" ");
    
    }
    System.out.println();
    
    
    }
    
    
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=a.length;
        
        QuickSort qs=new QuickSort();
        qs.quickSort(a,0,t-1);
        printArray(a);
        
    
    
    }
    
}
