//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;
public class countfreqq {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         Collections.sort(list);
         System.out.println(list);
        int numbers[];

         Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number []) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        System.out.println("Number Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());




    }
    
    }
}
