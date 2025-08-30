import java.util.*;
public class sortingarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size] ;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        sc.close();

    }
    
}
