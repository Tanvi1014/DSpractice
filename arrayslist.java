import java.util.*;
public class arrayslist {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);

        list.add(2 , 6);
        System.out.println(list);

        list.set(3, 7);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        

        Collections.sort(list);
        System.out.println(list);

    


    }
    
}
