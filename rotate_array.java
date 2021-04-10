
public class rotate_array {
 public static void reverse(int arr[], int l, int r) {
		while(l<r) {
			int tmp=arr[l];
			arr[l]=arr[r];
			arr[r]=tmp;
			l++;
			r--;
		}
		
 }
	public static void rotate(int arr[],int k) {
		k= k% arr.length;
		
		if(k<0) {
			k=k+arr.length;
		}
		
		//part 1
		reverse(arr,0,arr.length-k-1);
		
		//part 2
		reverse(arr,arr.length-k,arr.length-1);
		
		//part 3
		
		reverse(arr,0,arr.length-1);
		
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int k=2;
		rotate(arr,k); // Right rotate by k 
	//	rotate(arr,-k); //left roate by k
		for(int n : arr) {
			System.out.print(n+" ");
		}
		
	}

}
