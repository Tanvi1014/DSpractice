import java.util.*;
public class LLoddeven {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("the unsorted list is -->" + list);
        for(int i = 0; i<list.size() ; i = i + 2){
            System.out.print("the odd sorted list is -->" + i);
        }
    }
    
}
