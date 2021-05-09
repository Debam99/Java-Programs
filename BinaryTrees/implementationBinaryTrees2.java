import java.util.*;

public class implementationBinaryTrees2 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node){
    if(node==null){
            return;
        }
String str="";
str+=node.left==null? "." : node.left.data + "";
str+= " <- "+node.data+" -> ";
str+=node.right==null? "." : node.right.data + "";
 System.out.println(str);
 display(node.left);
 display(node.right);
}

public static int size(Node node){
    if (node==null){
        return 0;
    }
    int ls=size(node.left);
    int rs=size(node.right);
    int ts=ls+rs+1;

    return ts;
}

public static int sum(Node node){
    if (node==null){
        return 0;
    }
    int lsm=sum(node.left);
    int rsm=sum(node.right);
    int tsm=lsm+rsm+node.data;

    return tsm;
}

public static int max(Node node){
    if (node==null){
        return Integer.MIN_VALUE;
    }
    int lmax=max(node.left);
    int rmax=max(node.right);
    int tmax=Math.max(node.data,Math.max(lmax,rmax));

    return tmax;
} 

public static int height(Node node){
    if (node==null){
        return -1; // -1 for edges case and 0 for nodes case
    }
    int lh=size(node.left);
    int rh=size(node.right);
    int th=Math.max(lh,rh)+1;

    return th;
} 

public static void preOrder(Node node){
    if(node==null)
    return;
System.out.print(node.data+" ");
preOrder(node.left);
preOrder(node.right);
}


public static void postOrder(Node node){
    if(node==null)
    return;

postOrder(node.left);
postOrder(node.right);
System.out.print(node.data+" ");
}

public static void inOrder(Node node){
    if(node==null)
    return;

inOrder(node.left);
System.out.print(node.data+" ");
inOrder(node.right);

}

public static void main(String[] args) {
    Integer arr[]={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
   
    Node root = new Node(arr[0],null,null);
    Pair rtp=new Pair(root,1);

    Stack <Pair> st=new Stack<>();
    st.push(rtp);

    
    int index=0;
    while(st.size()>0){
        Pair top=st.peek();
        if(top.state==1){
            index++;
            if(arr[index] !=null){
                top.node.left=new Node(arr[index],null,null);
                Pair lp=new Pair(top.node.left,1);
                st.push(lp);
            }else{
                top.node.left=null;
            }
            top.state++;
        }else if(top.state==2){
            index++;
            if(arr[index] !=null){
                top.node.right=new Node(arr[index],null,null);
                Pair rp=new Pair(top.node.right,1);
                st.push(rp);
            }else{
                top.node.right=null;
            }
            top.state++;
        }else{
            st.pop();
        }
    }
    display(root);
    int size=size(root);
    int sum=sum(root);
    int max=max(root);
    int height=height(root);
    // System.out.println(size);
    // System.out.println(sum);
    // System.out.println(max);
    // System.out.println(height);

    preOrder(root);
    System.out.println();
    inOrder(root);
    System.out.println();
    postOrder(root);

}
 
}
