import java.util.*;
public class digitFrequency {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
System.out.println("Enter the no");
int n= sc.nextInt();
System.out.println("Enter the digit to be checked");
int d=sc.nextInt();

int f=0;


for(int i=n;i>0;i/=10){
    int dig=i%10;
    if(dig==d)
    f++;
}
System.out.println("Frequency of "+d+" is "+f);
}
}