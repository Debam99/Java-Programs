public class maxOfArray {

    public static int maximum(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }

        int misa=maximum(arr, index+1);
        if(arr[index]>misa){
            return arr[index];
        }else{
            return misa;
        }
    }
   public static void main(String[] args) {
       int arr[]={10,90,35,15,65};
       int index=0;
       System.out.println(maximum(arr, index));
   } 
}
