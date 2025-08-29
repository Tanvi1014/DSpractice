import java.util.*;
public class zerotoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int size = sc.nextInt();
        Integer numbers[] = {3 ,4 ,6 , 0 , 0 , 8, 2};

         List<Integer> list = Arrays.asList(numbers);
        Arrays.asList(numbers);
        Collections.rotate(list, 9);

        System.out.println(list);

        sc.close();
    }
    
}
