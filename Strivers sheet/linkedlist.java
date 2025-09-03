public class linkedlist {
    Node head ;
    private int size;

    linkedlist() {
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
    public void addLast(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head ;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node cuurNode = head;

        while(cuurNode != null){
            System.out.println(cuurNode.data + " -->");
            cuurNode = cuurNode.next;
        }
        System.out.println("null");
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

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
        
    }

    
}
