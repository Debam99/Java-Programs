import java.util.*;
public class anyBaseToDecimal {
  
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no");
    int n= sc.nextInt();
    System.out.println("Enter the base of the number");
    int b= sc.nextInt(); 
    int dn=getValuesInDecimal( n, b);
    System.out.println("The decimal equivalent is "+dn);
    
}
public static int getValuesInDecimal(int n,int b){
int rv=0;
int p=1;

while(n>0){
    int dig=n%10;
    n=n/10;

    rv+=dig*p;
    p*=b;
}
return rv;
}
}

