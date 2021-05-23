public class DFSTrees {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

 static   Node root;
 
 public DFSTrees()
    {
        root = null;
    }
  
  public static void preOrder(Node node) {
    if (node == null)
        return;
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
}

  public static void main(String args[])
    {
       DFSTrees tree = new DFSTrees();
       tree.root= new Node(1);
       tree.root.left= new Node(2);
       tree.root.right= new Node(3);
       tree.root.left.left= new Node(4);
       tree.root.left.right= new Node(5);
        
      
       preOrder(root);
    }



}

