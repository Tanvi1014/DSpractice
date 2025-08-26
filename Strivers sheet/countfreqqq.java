 import java.util.*;
public class countfreqqq {
   


    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 1, 4, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency
        for (int num : numbers) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Print frequency
        System.out.println("Numbers Frequencies:");
        for (Integer key : frequencyMap.keySet()) {
            System.out.println("Number: " + key + ", Frequency: " + frequencyMap.get(key));
        }
    }
}

