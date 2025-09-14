import java.util.*;

public class movezero {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Integer numbers[] = new Integer[size];
    for(int i = 0; i<numbers.length ; i++){
        numbers[i] = sc.nextInt();
    }
        int j = 0; 

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                j++;
            }
        }
    }
}

