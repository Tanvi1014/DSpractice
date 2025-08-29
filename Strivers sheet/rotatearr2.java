import java.util.*;
public class rotatearr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = {5 , 6 , 7 , 8 ,9};

        List<Integer> list = Arrays.asList(numbers);
        Collections.rotate(list, size);
        Integer[] numbIntegers = list.toArray(new Integer[0]);
        System.out.println(numbIntegers);

        
         // Integer[] numbers = list.toArray(new Integer[0]);





    }
    
}
