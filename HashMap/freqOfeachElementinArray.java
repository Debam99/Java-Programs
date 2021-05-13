import java.util.*;
public class freqOfeachElementinArray {
    public static void main(String[] args) {
       
        int arr[] = {1,3,5,1,5,4,3,7};

        HashMap<Integer, Integer> hm= new HashMap<>();

       
        for (int val : arr) {
            if (hm.containsKey(val)) {
                int oldf = hm.get(val);
                int newf = oldf + 1;
                hm.put(val, newf);
            } else {
                hm.put(val, 1);
            }
        }


        for(Map.Entry<Integer,Integer>  x : hm.entrySet()){
        System.out.println(x.getKey() + " -> "+x.getValue());
        }
    }
}
