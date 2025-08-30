import java.util.*;
public class lowerbound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
         HashMap<Integer , Integer> map = new HashMap<>();
         for(int num : numbers){
            map.put(num, map.getOrDefault(num , 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
             if (entry.getValue() >= entry.getKey()){
                System.out.println(entry.getValue() + entry.getKey());
             }else{
                System.out.println(map.size());
             }
        }
        sc.close();
    }
    
}
