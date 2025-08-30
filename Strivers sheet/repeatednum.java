import java.util.*;

public class repeatednum {
    public static void main(String[] args) {
        int numbers[] = {1 , 2 , 3  , 2 , 5 ,2 };
        Arrays.sort(numbers);
        for(int i = 0; i<numbers.length - 1; i++){
            
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int num : numbers){
                map.put(num, map.getOrDefault(num , 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 3) {
                System.out.println( entry.getValue());
            }
        }
        System.out.println();
        }
    }
    
}
