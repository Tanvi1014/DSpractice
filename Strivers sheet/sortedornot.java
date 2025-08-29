import java.util.*;
public class sortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int i = numbers[numbers.length - 1];

        
            if(numbers[i] < numbers[i+1]){
                System.out.println("false");
            }else{
                System.out.println("true");
            }

        
        sc.close();
    }
    
}
