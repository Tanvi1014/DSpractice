import java.util.*;
public class oddornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0 ){
            System.out.println("the num " + " " +  n + " " + "is even");
        }else{
            System.out.println("the num is odd");
        }
        sc.close();
    }
    
}
