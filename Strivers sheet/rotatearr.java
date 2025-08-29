import java.util.*;
public class rotatearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        Integer numbers[] = new Integer[size];

         for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        List<Integer> list =  Arrays.asList(numbers);
        Collections.rotate(list,1);
        System.out.println(list);

        
Integer[] arr = list.toArray(new Integer[0]);

      sc.close();



    }
    
}
