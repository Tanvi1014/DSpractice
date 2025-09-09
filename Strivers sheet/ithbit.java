import java.util.*;
public class ithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         //shifting by 1 position (right shift)
        int mask = 1 << b;
        if ((a & mask) != 0) {
            System.out.println("The " + b + "th bit is SET (1).");
        } else {
            System.out.println("The " + b + "th bit is NOT SET (0).");
        }
        sc.close();


    }
    
}
