import java.util.*;
public class removelastsetbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();

        int result = a & (a-1);
                System.out.println("Original number: " + a + " (" + Integer.toBinaryString(a) + ")");
        
      System.out.println( result + " (" + Integer.toBinaryString(result) + ")");
        sc.close();
    }
    
}
