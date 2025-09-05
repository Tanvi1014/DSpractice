import java.util.*;
public class LLmiddlee {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int middleindex = list.size() / 2;
        list.remove(middleindex);
    System.out.println("the new list is -->" + list);
    }
    
}
