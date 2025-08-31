
import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0 ; i <size ; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i<numbers.length -1 ; i++){
            if(numbers[numbers[i]] == numbers[numbers[i+1]] || numbers[numbers[i]] == numbers[numbers[i - 1]]){
                System.out.println(numbers[i]);

            }
            System.out.println(i);
        }
        sc.close();
    }
    
}
