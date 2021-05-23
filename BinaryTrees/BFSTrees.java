import java.util.*;
public class BFSTrees {
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
 
 public BFSTrees()
    {
        root = null;
    }
    public static int height(Node node) {
        if (node == null) {
            return 0; // -1 for edges case and 0 for nodes case
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh, rh) + 1;

        return th;
    }
  /* function to print level order traversal of tree*/
  void printLevelOrder()
  {
      int h = height(root);
      int i;
      for (i=1; i<=h; i++)
          printCurrentLevel(root, i);
  }


  /* Print nodes at the current level */
  void printCurrentLevel (Node root ,int level)
  {
      if (root == null)
          return;
      if (level == 1)
          System.out.print(root.data + " ");
      else if (level > 1)
      {
          printCurrentLevel(root.left, level-1);
          printCurrentLevel(root.right, level-1);
      }
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
       BFSTrees tree = new BFSTrees();
       tree.root= new Node(1);
       tree.root.left= new Node(2);
       tree.root.right= new Node(3);
       tree.root.left.left= new Node(4);
       tree.root.left.right= new Node(5);
        
       System.out.println("Level order traversal of binary tree is ");
       tree.printLevelOrder();
       System.out.println();
       preOrder(root);
    }



}
