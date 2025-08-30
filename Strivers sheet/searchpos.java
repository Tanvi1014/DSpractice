import java.util.*;
public class searchpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        Integer numbers[] = {2 , 3 , 5 ,6 ,8, 9};

        Arrays.sort(numbers);
        List<Integer> list = Arrays.asList(numbers);
        System.out.println(list);
        list.get(2);
        list.get(4);
        sc.close();
    }
    
}
