public class allOccurrence {
    public static int[] allIndex(int arr[], int x, int index, int osf) {

        if (index == arr.length) {
            return new int[osf];
        }

        if (arr[index] == x) {
            int newArr[]=allIndex(arr, x, index + 1, osf + 1);
            newArr[osf]=index;
            return newArr;
        } else {
           int newArr[]= allIndex(arr, x, index + 1, osf);
            return newArr;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 5, 8, 7, 3, 5 };
        int x = 3;
        int index = 0;
        int osf = 0;
        int res[]=allIndex(arr, x, index, osf);
        for(int i : res)
        System.out.print(i+" ");
    }
}
