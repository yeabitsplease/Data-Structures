import java.util.*;
public class BubbleSort {
    
    static void bubbleSort(int[] x,int n){
    
      int i, j, temp; 
        boolean flag; 
        for (i = 0; i < n - 1; i++)  
        { 
           flag = true; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (x[j] > x[j + 1])  
                { 
    
                    temp = x[j]; 
                    x[j] = x[j + 1]; 
                    x[j + 1] = temp; 
                    flag = false; 
                } 
            } 
  
            if (flag==true) 
                break; 
        } 
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
    
    bubbleSort(a, n);
    printArray(a,n);
    
    }
}
