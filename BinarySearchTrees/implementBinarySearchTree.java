/* Implementation of binary Search Tree in java*/
import java.util.*;

public class implementBinarySearchTree {

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

    public static Node construct(int arr[], int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = (lo + hi) / 2;
        int data = arr[mid];
        Node lc = construct(arr, lo, mid - 1);
        Node rc = construct(arr, mid + 1, hi);

        Node node = new Node(data, lc, rc);
        return node;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public static int size(Node node) {
        if (node == null) {
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;

        return ts;
    }

    public static int sum(Node node) {
        if (node == null) {
            return 0;
        }
        int lsm = sum(node.left);
        int rsm = sum(node.right);
        int tsm = lsm + rsm + node.data;

        return tsm;
    }

    public static int max(Node node) {
        if (node.right != null) {
            return max(node.right);
        } else {
            return node.data;
        }
    }

    public static int min(Node node) {
        if (node.left != null) {
            return min(node.left);
        } else {
            return node.data;
        }
    }

    public static boolean find(Node node, int data) {
        if (node == null) {
            return false;
        } else if (data > node.data) {
            return find(node.right, data);
        } else if (data < node.data) {
            return find(node.left, data);
        } else {
            return true;
        }
    }

    public static boolean lookUp(int value){
        Node curr= root;
        if(root==null){
            return false;
        }
        while(curr!=null){
            if(value<curr.data){
                curr=curr.left;
            }else if(value>curr.data){
                curr=curr.right;
            }else if(value==curr.data){
                return true;
            }
        }
        return false;
    }

    public static Node add(Node node, int data) {
        if (node == null) {
            return new Node(data, null, null);
        } else if (data > node.data) {
            node.right = add(node.right, data);
        } else if (data < node.data) {
            node.left = add(node.left, data);
        }
        return node;
    }

    public static Node remove(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (data > node.data) {
            node.right = remove(node.right, data);

        } else if (data < node.data) {
            node.left = remove(node.left, data);
        } else {
            if (node.left != null && node.right != null) {
                int lmax = max(node.left);
                node.data = lmax;
                node.left = remove(node.left, lmax);
                return node;
            }else if(node.left!=null){
                return node.left;
            }else if(node.right!=null){
                return node.right;
            }else{
                return null;
            }
        }
        return node;
    }
static Node root;
    public static void main(String[] args) {
        int arr[] = { 12, 25, 37, 50, 62, 75, 87 };
         root = construct(arr, 0, arr.length - 1);
        // display(root);
        // add(root, 100);
        // System.out.println("-------------------------");
        // display(root);
        // System.out.println("-------------------------");
        // remove(root,87);
         //display(root);

       lookUp(87);
    }

}
