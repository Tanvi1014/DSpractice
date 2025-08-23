import java.util.Scanner;
public class gcd2 {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int gcd = findGCD(n1, n2);
        System.out.println(gcd);
        
        sc.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


