import java.util.*;
public class decimalToAnyBase {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no");
    int n= sc.nextInt();
    System.out.println("Enter the base to be converted to");
    int b=sc.nextInt(); 
    int dn=getValuesInBase( n, b);
    System.out.println(dn);
}
public static int getValuesInBase(int n,int b){
int rv=0;
int p=1;

while(n>0){
    int dig=n%b;
    n=n/b;

    rv+=dig*p;
    p*=10;
}
return rv;
}
}