import java.util.*;
public class thirdmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int j = numbers[size];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        } 
        Arrays.sort(numbers);
       System.out.println(numbers[j- 3]);
       sc.close();
    }
    
}
