import java.util.*;
public class floorndciel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        int n = sc.nextInt();
        int k = numbers[numbers[n] - 1];
        int j = numbers[numbers[n] + 1];
        System.out.println( k +" " + j);
        sc.close();
    }
}

