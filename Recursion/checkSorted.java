import java.util.*;

public class checkSorted {

    public static boolean sorted(int arr[], int n) {
       
        if ( n== 1 || n==0) {
            return true;
        }

        if (arr[n-1] < arr[n-2]) {
            return false;
        }
        return sorted(arr,n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sorted(arr, n));
    }
}
