import java.util.*;

public class unionarr {
    public static void main(String[] args) {
        
        Integer number[] ={1 , 2 , 3 , 4};
        Integer numbers[] ={3 , 5, 6 , 7};
        Set<Integer> set = new HashSet<>();
        for(int element : number){
            set.add(element);
        }
        for(int element : numbers){
            set.add(element);
        }
        Integer[] unionArray = set.toArray(new Integer[0]);
       System.out.println( Arrays.toString(unionArray));
    }
    
}
