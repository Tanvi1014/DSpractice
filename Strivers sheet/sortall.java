public class sortall {
    public static Node segregate(Node head) {
        if (head == null || head.next == null)
            return head;

        Node zeroD = new Node(-1), oneD = new Node(-1), twoD = new Node(-1);
        Node zero = zeroD, one = oneD, two = twoD;
        Node curr = head;

        // Partition the list into three lists
        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        // Connect the three lists
        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;

        // New head is the first non-empty list
        return zeroD.next;
    }
}


