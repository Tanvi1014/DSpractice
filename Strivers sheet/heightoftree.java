public class heightoftree {
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

        
        }
    

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("THE MAX HEIGHT OF THE NODES IS :" + BinaryTree.height(root));

        
       
    }
}

