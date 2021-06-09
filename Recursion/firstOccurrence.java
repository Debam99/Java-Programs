public class firstOccurrence {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,8,7,3,5};
        int x=3;
        int index=0;
        System.out.println(firstIndex(arr, x, index));
    }
    public static int firstIndex(int arr[],int x,int index){
        
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==x){
            return index;
        }else{
            int first=firstIndex(arr, x, index+1);
            return first;
        }
    }
}
