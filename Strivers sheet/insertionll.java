public class insertionll {
   
    Node head ;
   private int size;

    insertionll() {
     size = 0;
    }

    private class Node {
       String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
           size++;
        }
    }

    public void addFirst(String data){
        Node newnNode = new Node(data);
        newnNode.next = head;
        head = newnNode;  
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
       list.addFirst("youu");
       list.addFirst("heyyy");
       list.printList();
    }
    
}
