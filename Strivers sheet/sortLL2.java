import java.util.Collections;
import java.util.LinkedList;

public class sortLL2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(5);
        System.out.println("the unsorted list is --> " + list);
        Collections.sort(list);
        System.out.println("the sorted list is --> " + list);
    }
    
}
