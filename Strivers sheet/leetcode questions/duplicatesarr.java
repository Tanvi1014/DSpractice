import java.util.*;

public class duplicatesarr {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        for(int i = 0; i<size ; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        
        
         System.out.println("Duplicates are:");
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i].equals(numbers[i + 1])) {
                System.out.println(numbers[i]);
            }
        }


    }
}
