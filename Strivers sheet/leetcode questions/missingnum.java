import java.util.*;

public class missingnum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Integer numbers[] = new Integer[size];
    for(int i = 0; i<numbers.length; i++){
        numbers[i] = sc.nextInt();
    }
    int i = sc.nextInt();
    Arrays.sort(numbers);
    for(int j = 0 ; j < numbers.length; j++){
        if(numbers[numbers[i]] == numbers[numbers[i + 2]]){
            System.out.println("the number missing is :" + " " + i +1 );
        }
        System.out.println();
    }
    sc.close();
    }
}
