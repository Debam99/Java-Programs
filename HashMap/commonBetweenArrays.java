import java.util.*;

public class commonBetweenArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : a1) {
            if (hm.containsKey(val)) {
                int oldf = hm.get(val);
                int newf = oldf + 1;
                hm.put(val, newf);
            } else {
                hm.put(val, 1);
            }
        }

        for (int val : a2) {
            if (hm.containsKey(val)) {
                System.out.println("The common elements are" + val);
                hm.remove(val);
            }
        }

    }
}
