public class delnode { 
    Node head ;
   private int size;

    delnode() {
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

   public void removeFirst() {
        if(head == null) {
            System.out.println("Empty list , noting to delete");
            return;
        }

        head = this.head.next;
        size--;
    }
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty list , nothing to remove");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
       list.addFirst("youu");
       list.addFirst("heyyy");
       list.addLast("my");
       list.addLast("name");
       list.addLast("is");
       list.addLast("tanvi");
       list.printList();
       
       list.removeFirst();
       list.printList();

       list.removeLast();
       list.printList();
    }
    
}
