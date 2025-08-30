import java.util.*;
public class findel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        Arrays.sort(numbers);

       // List<Integer> list = Arrays.asList(numbers);
        for(int i = 0; i< numbers.length - 1; i++){
             int k = numbers[numbers[i]];
                System.out.println(k);
            }
           sc.close();
        }
        

    }
    

