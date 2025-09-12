import java.util.*;
public class longestdia {
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

    static class BinaryTree {
        static int idx = -1;

        // Build tree from array
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
          public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rigntHeight = height(root.right);

            int myHeight = Math.max(leftHeight , rigntHeight) + 1;

            return myHeight;
        }
        public static int diameter(Node root) {
            if(root == null){
                return 0;
            }
            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left ) + height(root.right) + 1;

            return Math.max(dia3 , Math.max(dia1, dia2));


        }

       

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // First build the tree
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("the longest node of the given tree is:" + BinaryTree.diameter(root));
    }
}

}
