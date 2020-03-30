import java.util.*;
public class CodeCHef_feblong_geomettry {
   
    
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
  
            
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
    
    static void findSum(int A[],int B[]){
    int sum=0;
        for(int p=0;p<A.length;p++){
        if(A[p]>B[p]){
        sum=sum+B[p];
        }
        else{
        sum=sum+A[p];
        }
        }
        System.out.println(sum);
    }   
    
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);  
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
        
        int N=sc.nextInt();
        int A[]=new int[N];
        int B[]=new int[N];
        
        for(int j=0;j<N;j++){
        A[j]=sc.nextInt();
        }
        for(int k=0;k<N;k++){
        B[k]=sc.nextInt();
        }
        
        CodeCHef_feblong_geomettry ob=new CodeCHef_feblong_geomettry();
        ob.sort(A,0,N-1);
        ob.sort(B,0,N-1);
        
        ob.findSum(A,B); 
        
        }
        
    }
}
