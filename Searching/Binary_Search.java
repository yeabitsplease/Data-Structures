public class Binary_Search {
    //Recursive implementation for binary search in time complexity O(logn)
    int binary_search(int x[],int l, int r, int y){
     
        if(r>=1){
        
            int mid=(l+(r-1))/2;
            
            if(x[mid]==y){
            return mid;
            }
            
            if(x[mid]>y)
                return binary_search(x,l,mid-1,y);
        
            
            return binary_search(x,mid+1,r,y);
        
        
        
        }
        
        
        
        return -1;
    }
    
    /*
    Iterative implementation for binary search in same time complexity O(Logn)
    Driver hasn't called this iterative implementation.For execution create DRIVER.
    */
    int binarySearchIterative(int arr[],int element){
        int firstindex=0,lastindex=arr.length-1;
        while(firstindex<=lastindex){
        int mid=(firstindex+(lastindex-1))/2;
            if(arr[mid]==element)
                return mid;
            if(arr[mid]<element)
                return firstindex=mid+1;
            else
                return lastindex=mid-1;
                
        }
    return -1;
    }
    
    
 public static void main(String args[]){
 Binary_Search bs=new Binary_Search();
 int arr[]={2,3,4,10,40,50};
 int n=arr.length;
 int x=10;
 Binary_Search b1=new Binary_Search();
 
 int answer=b1.binary_search(arr,0,n-1,x);
 
 if(answer== -1){
 System.out.println("Element not found");
 }
 else{
     
     System.out.println("Element found at: "+answer);
 
 }
    
    
    
    
}
}
