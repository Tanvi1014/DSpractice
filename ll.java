import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    class LinkedListCustom{
        Node head;

        void add(int data){
            Node newNode = new Node(data);
            if(head == null){
               head = newNode;
               return;
            }

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                
            }
            temp.next = newNode;

        }
    
        void printList(){
            Node temp = head;
            while( temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    



public class ll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListCustom list = new LinkedListCustom();
         int n = sc.nextInt();
        System.out.println("number of numbers :" +  n );

        for(int i = 0 ; i<n ; i++){
            int data = sc.nextInt();
            list.add(data);

        }
        System.out.println();
        list.printList();

    }
   
}





