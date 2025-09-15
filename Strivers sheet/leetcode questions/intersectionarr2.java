//import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersectionarr2 {
    public static void main(String[] args) {
        int numbers[] = {1 ,2 ,3 , 2 };
        int number[] = {1 , 2 , 2};

       Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : numbers) set1.add(n);
        for (int n : number) set2.add(n);

        set1.retainAll(set2); 
        System.out.println("Intersection: " + set1);


    }
    
}
