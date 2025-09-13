public class printinrang {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;

        }
        public static void printinrange(Node root , int X , int Y){
            if(root == null){
                return;
            }
            if(root.data>= X && root.data <= Y){
                printinrange(root.left, X, Y);
                System.out.println(root.data + " ");
                printinrange(root.right, X, Y);
            }else if (root.data >= Y){
                printinrange(root.left, X, Y);
            }else{
                printinrange(root.right, X, Y);
            }
        }

        public static void main(String[] args) {
            int values[] = {8 , 5, 3 ,1 , 4  , 6 , 10 , 11 , 14};
            Node root = null;

          printinrange(root, 6, 10); 
          System.out.println();
        }
    }
    
}
