import java.util.*;

public class containduplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Integer numbers[] = new Integer[size];
    for(int i = 0 ; i<numbers.length ; i++){
        numbers[i] = sc.nextInt();
        }
        int i = sc.nextInt();
        Arrays.sort(numbers);
        System.err.println(numbers[i]);
        for(int j = 0; j<numbers.length ; j++){
            if(numbers[numbers[j]] == numbers[numbers[j + 1]] || numbers[numbers[i]] == numbers[numbers[j - 1]]){
                System.out.println("the duplicate present in this arr is:" + j);
            }
            System.out.println();
        }
        sc.close();

}
}