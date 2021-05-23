public class findPower {
   public static int power(int a,int b){
    //base case
    if(b==0)
    return 1;

    //recursive assumption
    int subproblem=power(a,b-1);

    //self work
    return a*subproblem;
    }

    //optimized Approach

    public static int power2(int a,int b){
        //base case
        if(b==0)
        return 1;
        if(b==1)
        return a;
    
    
        //recursive assumption
        int temp=power2(a,b/2);
    
        //self work
        if(b%2==0){
        return temp*temp;
        }else{
            return a*temp*temp;
        }
    }
    public static void main(String[] args) {
        int a=3;
        int b=3;
        System.out.println(power(a,b));
        System.out.println(power2(a,b));
    }
}
