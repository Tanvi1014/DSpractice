//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;
public class countfreqq {
      public static void main(String[] args) {
        
     
       // ArrayList<Integer> list = new ArrayList<>();
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
         //Collections.sort(list);
         //System.out.println(list);
        int number[] ={ 1 , 4, 6 , 6 , 8, 1 };

         Map<Integer, Integer> map = new HashMap<>();

        for (int numbers : number ) {
            if (map.containsKey(numbers)){
                map.put(numbers , map.get(number)+ 1);
            }else{
                map.put(numbers, 1);
            }
            
        }
    

       // System.out.println("Numbers Frequencies:");
        for ( int key : map.keySet()) {
            System.out.println(key + map.get(key));




        }
    }
    }

