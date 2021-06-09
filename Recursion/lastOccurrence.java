import java.util.*;
public class lastOccurrence{

    public static int lastIndex(int arr[], int x, int index){
        if(index==arr.length){
            return -1;
        }
        int last=lastIndex(arr, x, index+1);

        if(last ==-1){
            if(x==arr[index]){
                return index;
            }else{
                return last;
            }

        }else{
        return last;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,3,5,8,7,3,5};
        int x=3;
        int index=0;
        System.out.println(lastIndex(arr, x, index));
    }
}