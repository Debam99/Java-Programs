import java.util.*;
public class anyBaseToAnyBase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no");
        int n= sc.nextInt();
        System.out.println("Enter the base of the no");
        int b1=sc.nextInt(); 
        System.out.println("Enter the base to be converted to");
        int b2=sc.nextInt(); 

        int res =getValue(n,b1,b2);
        System.out.println("The eqiuvalent no is "+res);

    }

    public static int getValue(int n, int b1, int b2){
int dec= anyBaseToDecimal(n, b1);
int result=decimalToAnyBase(dec,b2);
return result;
    } 


    public static int anyBaseToDecimal(int n,int b){
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

        public static int decimalToAnyBase(int n,int b){
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
