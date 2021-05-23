import java.util.*;
    
public class subsetOfString {
    
        public static void printSubset(String arr[],int i,int n,String osf){
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
        
       String arr[]={"a","b","c"};
       int n=arr.length;
    
        System.out.println("The subsets are : ");
        printSubset(arr,0,n,"");
    }
    }  

