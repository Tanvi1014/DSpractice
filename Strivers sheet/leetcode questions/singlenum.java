import java.util.*;

public class singlenum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Integer numbers[] = new Integer[size];
    for(int i = 0; i<numbers.length ; i++){
        numbers[i] = sc.nextInt();
    }
    Arrays.sort(numbers);
    for(int j = 0; j<numbers.length ; j++){
        if(numbers[numbers[j]] != numbers[numbers[j + 1]] || numbers[numbers[j]] != numbers[numbers[j - 1]] ){
            System.out.println("the number appearing only one time is" + j);
        }
    }
    
}
}