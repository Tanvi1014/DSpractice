//import java.util.*;
public class reversewords {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in); 
       //String original = sc.nextLine();
         String original = "Tanvi";
        StringBuilder sb = new StringBuilder(original);
       String reversed = sb.reverse().toString();
       System.out.println("the reversed string is ->" + reversed);
    }
    
}
