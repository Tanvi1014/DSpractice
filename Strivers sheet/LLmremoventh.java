import java.util.*;
public class LLmremoventh {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("the original list is -->" + list);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = list.get(n);
        list.remove(n);
        System.out.println("the list after remove " + list);
        sc.close();
    }
    
}
