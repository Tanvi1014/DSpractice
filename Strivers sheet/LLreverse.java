import java.util.*;
public class LLreverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
       Collections.reverse(list);
       System.out.println("reversed list : " + list);
    }
    
}
