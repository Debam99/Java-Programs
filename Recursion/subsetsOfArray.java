import java.util.*;
public class subsetsOfArray{
    public static void printSubset(int arr[],int i,int n,String osf){
        //base case
        if(i==n){
            System.out.println("["+osf+"]");
        return; 
    }
    //including the element
    printSubset(arr, i+1, n, osf +arr[i]+",");
    //not including the element
    printSubset(arr,i+1,n,osf);    
}


public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size");
    int n= sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("The subsets are : ");
    printSubset(arr,0,n,"");
}
}