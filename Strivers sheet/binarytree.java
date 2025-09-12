public class binarytree {
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
    static class Binarytree {
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
    }

    public static void main(String[] args) {
        int node[] ={1 ,2 ,4 , -1 , -1 , 5, -1 ,-1, 3, -1 , 6, -1 , -1 };
        binarytree.Binarytree tree = new binarytree.Binarytree();

        Node root =  tree.buildTree(node);
        System.out.println(root.data);

    }
    
}
