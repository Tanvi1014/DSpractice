//import java.util.*;

import java.util.Arrays;

public class intersectionarr {
    public static void main(String[] args) {
   // Scanner sc = new Scanner(System.in);
    //int size = sc.nextInt();
    Integer numbers[] = {1 ,2 , 3 , 2 };
    Integer number[] ={2 , 3 , 2};
    Arrays.sort(numbers);
    Arrays.sort(number);
    for(int i = 0; i< numbers.length ; i++){
        for(int j = 0; j<number.length ; j++){
            if(numbers[i].equals(number[j])){
                System.out.println("the intersection of two arr is :" + " " + numbers[i] + " " + number[j]);
                break;
            }
        }
    }
    
    
}
}
