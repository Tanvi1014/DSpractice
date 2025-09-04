import java.util.*;
public class freqsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "tree";
        HashMap<Character , Integer> map = new HashMap<>();
        for(int idx = 0; idx <= s.length() -1 ; idx++){
            map.put(s.charAt(idx), map.getOrDefault(s.charAt(idx), 0) + 1);
        }
          for (Map.Entry<Character, Integer> entry : map.entrySet()){
          System.out.println( entry.getKey() + " occurs -->" + entry.getValue() + "times" );
        }


    }
    
}
 