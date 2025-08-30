import java.util.*;
public class rotatesearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        Arrays.sort(numbers);
        List<Integer> list = Arrays.asList(numbers);
        Collections.rotate(list, 3);
        System.out.println(list);
        list.get(4);
        System.out.println(list);
        sc.close();
    
    }
    }
    

