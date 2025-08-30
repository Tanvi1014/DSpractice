import java.util.*;
public class countoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        Arrays.sort(numbers);
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int num : numbers){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() > 2){
                System.out.println(entry.getValue());
             }

        }
            
     sc.close();

    }
    
}
