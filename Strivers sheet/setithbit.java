import java.util.*;
public class setithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mask = 1 << b;
        int result = a | mask;
      System.out.println("Original number: " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("After setting " + b + "th bit: " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        sc.close();

    }
    
}
