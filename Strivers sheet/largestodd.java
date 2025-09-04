import java.util.*;
public class largestodd {
    public static void main(String[] args) {
       
    }
    
    public String Largestodd(String number){
        Scanner sc = new Scanner(System.in);
        for(int i = number.length() - 1 ; i <= 0 ; i--){
             if (Character.getNumericValue(number.charAt(i)) % 2 != 0) {
                return number.substring(0, i + 1);

        }
        
    }

           return " ";   
    }
}

    

