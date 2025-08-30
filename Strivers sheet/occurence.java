import java.util.*;
public class occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find indexes of: ");
        int target = sc.nextInt();

        // Find and print all indexes of the target number
        System.out.println("Indexes of number " + target + ":");
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println(i);  
                found = true;
            }
        }

        if (!found) {
            System.out.println("-1");
        }

        sc.close();
    }
    
}
