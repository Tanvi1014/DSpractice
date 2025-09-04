import java.util.*;
public class reversell {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.print("the order of the reversed list is -->" + list);

    }
    
}
