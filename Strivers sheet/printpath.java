import java.util.*;
public class printpath {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left=null;
        }
    }
    static void printpath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.println(path.get(i) + "-->");
        }
        System.out.println();
    }
    public static void printroot2leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        //leaf
        if(root.left == null && root.right == null){
            printpath(path);
        }else{
            //non leaf
            printroot2leaf(root.left, path);
            printroot2leaf(root.right, path);
        }
        path.remove(path.size() -1 );
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3 , 1 , 4 , 6 , 10 , 11 , 14};
        Node root = null;

        printroot2leaf(root, new ArrayList<>());
    }
}
