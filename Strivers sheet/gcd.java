import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if( n1 == n2 ){
            System.out.println("n1");
        } else if ( n1 % n2 == 0){
            if( n1 > n2 ){
                System.out.println("n2");
            }if (n2 > n1 ){
                System.out.println("n1");
            }
        }else if ( n1 % n2 != 0){
            System.out.println("1");
        }
        
        
     
         sc.close();


    }
    
}
