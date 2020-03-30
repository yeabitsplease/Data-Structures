import java.util.*;
public class LinearSearch {
    
   public int findElement(int x[],int element){
   int i;
       for(i=0;i<=x.length-1;i++){
       if(element==x[i]){
       return i;
          
       
       }
       }
       
   return 0;
   }
    
    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int  n=sc.nextInt();
        int[] a;
       a=new int[n];
    int i;
    for(i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    System.out.println("Enter the element to find: ");
    int ele=sc.nextInt();
    LinearSearch ls=new LinearSearch();
    int res= ls.findElement(a, ele);
    System.out.println("Element found at: "+res);
    }
}
