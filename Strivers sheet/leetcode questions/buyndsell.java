import java.util.*;

public class buyndsell {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int i = sc.nextInt();
    Integer numbers[] = new Integer[size];
    for(int l = 0 ; i<numbers.length ; i++){
        numbers[l] = sc.nextInt();
    }
    Arrays.sort(numbers);
    int j = numbers[numbers[0]];
    int k = numbers[numbers[i - 1]];
    int profit = k - j;
    System.out.println("the maximum profit which a person can make is" + profit);

}
}