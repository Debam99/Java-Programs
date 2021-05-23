public class decreasingNos {
    public static void print(int n){
        //base case
        if(n==0)
        return;
       
        //self work
        System.out.println(n);
         //recursive assumption
        print(n-1);
        
           }
           
           
            public static void main(String[] args) {
               int n=5;
               print(n);
           } 
        }
        

