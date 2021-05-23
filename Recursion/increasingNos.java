public class increasingNos {
   
   public static void print(int n){
//base case
if(n==0)
return;
//recursive assumption
print(n-1);
//self work
System.out.println(n);

   }
   
   
    public static void main(String[] args) {
       int n=5;
       print(n);
   } 
}
