import java.util.*;
public class numpowerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mask = n & (n - 1);

        if(mask == 0){
            System.out.println("the number " + n + "is of power 2");

        }else{
            System.out.println("the number" + n + "is not the power of 2") ;
        }
        sc.close();
    }
    
}
