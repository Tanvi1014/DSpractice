import java.util.*;
public class countnodes {
      static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
        static class Countnodes {
        static int idx = -1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx] == -1){
             return null;
            }
        
          Node newNode = new Node(node[idx]);
          newNode.left = buildTree(node);
          newNode.right = buildTree(node);

          return newNode;
        }
    

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return 1 + leftCount + rightCount;

    }
}
    public static void main(String[] args) {
                int node[] ={1 ,2 ,4 , -1 , -1 , 5, -1 ,-1, 3, -1 , 6, -1 , -1 };
      Node root = Countnodes.buildTree(node);
      System.out.println("total no. of the nodes are:" + Countnodes.countNodes(root));
    }
    
}
