public class decreasingIncreasing {
   
        public static void print(int n){
            //base case
            if(n==1){
            System.out.println(n);
            return;}
           
            //self work
            System.out.println(n);
             //recursive assumption
            print(n-1);

         
            System.out.println(n);

            
         
               }

               
               
               
                public static void main(String[] args) {
                   int n=5;
                   print(n);
                  
               } 
            }
            
    
    

