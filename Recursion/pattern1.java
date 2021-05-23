public class pattern1 {
    public static void print(int n){
        //base case
        if(n==0){
        return;
        }
        
        //self work
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();

        //recursive assumption
      print(n-1);
    }


 public static void  pattern(int n, int i){
//base case
if(n==0)return;

if(i<n){
    System.out.print("* "); //self case
    pattern(n,i+1); //recursive assumption
}else{
    System.out.println();
    pattern(n-1,0);
}

    }
    public static void main(String[] args) {
   // print(5); 
    pattern(5,0);
    }
}
