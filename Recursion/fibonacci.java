import java.util.*;
public class fibonacci {

  
   public static int fibo(int n){
       //Base Case
        if(n==1 || n==0)
        return n;
        //Recursive assumption
        int subproblem1 = fibo(n-1);
        int subproblem2=fibo(n-2);
        //Self Work
        return subproblem2 + subproblem1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=3;
        System.out.println(fibo(n));

    }
}


