import java.util.*;
public class bitswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the numbers before swapping are " + a + b);

        //swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("the numbers after swapping are" + a + b);
        sc.close();
    }
    
}
