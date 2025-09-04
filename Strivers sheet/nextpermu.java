import java.util.*;
public class nextpermu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        int idx;
    
         List<Integer> list = Arrays.asList(numbers);
          for(int i = idx ; i< numbers.length - 1 ;i++){
            int temp = i;
            i = idx;
            idx = temp;
          }
          



    }

    }
    

