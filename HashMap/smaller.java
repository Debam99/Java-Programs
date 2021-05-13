import java.util.*;
public class smaller {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int smaller[]=new int[9];

        for(int i=0; i<a.length;i++){
            smaller[a[i]]++;

        }
        for(int i=1; i<9;i++){
            smaller[i]+=smaller[i-1];

        }

        for(int i=0;i<a.length;i++){
            int position=a[i];
            if(position==0){
                a[i]=0;
            }else{
            a[i]=smaller[position-1];
            System.out.print(a[i]+" ");
        }
    }

        }
}
