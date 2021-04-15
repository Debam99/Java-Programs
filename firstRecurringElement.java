import java.util.*;

public class firstRecurringElement {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int val : a){
            if(hm.containsKey(val)){
                System.out.println("The first recurring element is "+val);
                break;
            }
            else{
                hm.put(val,1);
            }
    
        }
    }
}


