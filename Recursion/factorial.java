import java.util.*;
public class factorial {
  
   public static int fact(int n){
       //Base Case
        if(n==1)
        return 1;
        //Recursive assumption
        int subproblem = fact(n-1);
        //Self Work
        return n*subproblem;
    }




    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=5;
        System.out.println(fact(n));

    }
}
