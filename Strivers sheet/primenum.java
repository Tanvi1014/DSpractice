import java.util.*;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean input = sc.nextBoolean();

        while(n>0){
            if(n / 2 == 0 || n / 3 == 0 || n / 5 == 0  ){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
        sc.close();

    }
}
