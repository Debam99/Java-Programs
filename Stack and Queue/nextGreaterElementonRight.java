import java.util.*;
public class nextGreaterElementonRight {
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        ArrayList<Integer> nge= new ArrayList<>();
        Stack<Integer> st=new Stack<>();
int size=arr.length;

for(int i=size-1; i>=0; i--){
    if(st.size()==0){
        nge.add(-1);
    }
    else if(st.size()>0 && st.peek()>arr[i]){
        nge.add(st.peek());
    }else if(st.size()>0 && st.peek()<=arr[i]){
        while(st.size()>0 && st.peek()<=arr[i]){
            st.pop();
        }
        if(st.size()==0){
            nge.add(-1);
        }else{
            nge.add(st.peek());
        }
    }
    st.push(arr[i]);
}
Collections.reverse(nge);

for(int i : nge){
    System.out.print(i+" ");
}



    }

    
}
