import java.util.*;
public class longestdia2 {
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
    static class Treeinfo{
        int ht ;
        int dia;
        Treeinfo(int ht , int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }
    public static Treeinfo dia2(Node root){

        Treeinfo left = dia2(root.left);
        Treeinfo right = dia2(root.right); 

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht + 1;

        int mydia = Math.max(Math.max(dia1 , dia2 ) , dia3);
        Treeinfo myInfo = new Treeinfo(myHeight, mydia);
        return myInfo;
         
    }
    public static void main(String[] args) {
        int nodes[] = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(dia2(root));
        }
    }
}

