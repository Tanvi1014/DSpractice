import java.util.*;
public class toggleithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mask = 1 << b;
        int result = a ^ mask;
                System.out.println("Original number: " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("After clearing " + b + "th bit: " + result + " (" + Integer.toBinaryString(result) + ")");
        sc.close();

    }
    
}
