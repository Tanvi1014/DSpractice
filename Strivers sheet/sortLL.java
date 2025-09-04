import java.util.*;
public class sortLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("the non-reversed list is -->" + list);
        Collections.reverse(list);
        System.out.println("the reversed list is --> " + list);
    }
    
}
